/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Isuru Sampath
 */
public class AutoSuggestionCombo {

    private JTextField tf;
    JComboBox combo = new JComboBox();
    private final Vector<String> v = new Vector<String>();
    private boolean hide_flag = false;

    public void loadItemsToCombo(JComboBox jc,String query1,String query2,String columName) {

        combo = jc;
        tf = (JTextField) combo.getEditor().getEditorComponent();
        tf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        String text = tf.getText();

                        System.out.println(text);
                        if (text.length() == 0) {
                            combo.hidePopup();
                            setModel(new DefaultComboBoxModel(v), "");
                        } else {
                            DefaultComboBoxModel m = getSuggestedModel(v, text,query2);
                            if (m.getSize() == 0 || hide_flag) {
                                combo.hidePopup();
                                hide_flag = false;
                            } else {
                                setModel(m, text);
                                combo.showPopup();
                            }
                        }
                    }
                });
            }

            public void keyPressed(KeyEvent e) {
                String text = tf.getText();

                System.out.println(text);
                int code = e.getKeyCode();
                if (code == KeyEvent.VK_ENTER) {
                    if (!v.contains(text)) {
                        v.addElement(text);
                        Collections.sort(v);
                        setModel(getSuggestedModel(v, text,query2), text);
                    }
                    hide_flag = true;
                } else if (code == KeyEvent.VK_ESCAPE) {
                    hide_flag = true;
                } else if (code == KeyEvent.VK_RIGHT) {
                    for (int i = 0; i < v.size(); i++) {

                        String str = v.elementAt(i);
                        if (str.startsWith(text)) {
                            combo.setSelectedIndex(-1);
                            tf.setText(str);
                            return;
                        }
                    }
                }
            }
        });

//  
        try {
            Connection con = control.Db.con();
            ResultSet rs = con.createStatement().executeQuery("select distinct(name) from country ");
            TreeSet<String> ts = new TreeSet<String>();
            while (rs.next()) {

                ts.add(rs.getString("name"));
//              v.add(rs.getString("st_name"));

            }
            ts.toString();
            String ar[] = ts.toString().replace("[", "").replace("]", "").trim().split(",");

            for (int i = 0; ar.length > i; i++) {
                v.add(ar[i].trim());
            }

            setModel(new DefaultComboBoxModel(v), "");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setModel(DefaultComboBoxModel mdl, String str) {
        combo.setModel(mdl);
        combo.setSelectedIndex(-1);
        tf.setText(str);
    }

    private static DefaultComboBoxModel getSuggestedModel(java.util.List<String> list, String text,String q2) {
        DefaultComboBoxModel m = new DefaultComboBoxModel();

//        for (String s : list) {
//
//                
//                m.addElement(s);
//            }
//            text.toLowerCase();
//          
//              if (s.startsWith(text)) {
//                  System.out.println(s);
//                m.addElement(s);
//            }
        try {
            Connection con = control.Db.con();
            ResultSet rs = con.createStatement().executeQuery(q2+"'" + text + "%' ");
            TreeSet<String> ts = new TreeSet<String>();
            while (rs.next()) {

                ts.add(rs.getString("name"));
//              v.add(rs.getString("st_name"));

            }
            ts.toString();
            String ar[] = ts.toString().replace("[", "").replace("]", "").trim().split(",");

            for (int i = 0; ar.length > i; i++) {
                m.addElement(ar[i].trim());
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return m;
    }
}
