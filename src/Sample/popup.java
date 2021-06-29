/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;

/**
 *
 * @author Isuru Sampath
 */
public class popup extends javax.swing.JFrame {

    public static Color FormColor = new Color(140, 205, 250);
    public static Color lblFontColor = new Color(0, 0, 0);
    Dimension screenSize = getToolkit().getScreenSize();
    //  String lookAndFeel = "de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel";

    /**
     * Creates new form Main
     */
    public popup() {

        initComponents();
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
//        model.Themes.setFullScreen(screenSize, this);
    //model.Themes.saveTheme(lookAndFeel);
        System.out.println(model.Themes.loadTheme());
//  jButton1.setMnemonic(KeyEvent.VK_1);
       this.setMinimumSize(new Dimension(500, 300));
    this.setMaximumSize(new Dimension(500, 300));

    }

    public popup(Dimension scr) {

        initComponents();
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
//        model.Themes.checkScreenSize(screenSize, this, scr);
        //  model.Themes.saveTheme(lookAndFeel);
        System.out.println(model.Themes.loadTheme());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jColorChooser1 = new javax.swing.JColorChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main");
        setSize(new java.awt.Dimension(1000, 600));
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
     this.setSize(500, 300);
    this.setLocation(((screenSize.width) / 2) - 250, ((screenSize.height) / 2) - 150);
    this.setMinimumSize(new Dimension(500, 300));
    this.setMaximumSize(new Dimension(500, 300));

    }//GEN-LAST:event_formWindowStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println(evt.getKeyCode() == 83 && evt.isControlDown());
        if (evt.getKeyCode() == 83 && evt.isControlDown()) {
         
            this.dispose();    // TODO add your handling code here:
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                new popup().setVisible(true);
            }
        });
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}