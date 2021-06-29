/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author CBC
 */
public class CommonMethods {

    public static double getTableColumnAmountDouble(JTable jtable, int column) {
        double d = 0.0;
        int count = jtable.getRowCount();
        int x = 0;
        while (count > x) {
            d = d + Double.parseDouble(jtable.getValueAt(x, column).toString());

            x++;
        }

        return d;
    }

    public static int getTableColumnAmountInteger(JTable jtable, int column) {
        int i = 0;
        int count = jtable.getRowCount();
        int x = 0;
        while (count > x) {
            i = i + Integer.parseInt(jtable.getValueAt(x, column).toString());

            x++;
        }

        return i;
    }

    public static void setColumnHide(JTable jTable1, int i) {
        try {
            TableColumn buying_price = jTable1.getColumnModel().getColumn(i);
            buying_price.setMinWidth(0);
            buying_price.setMaxWidth(0);
            buying_price.setWidth(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

    }

    public static void doubleValidation(JTextField tx, KeyEvent evt) {
        if (evt.getKeyCode() != 10 && evt.getKeyCode() != 8) { //enter key = 10, backspace key=8
            if (!tx.getText().matches("-?\\d+(\\.\\d*)?")) { //this is integer and double regex code

                JOptionPane.showMessageDialog(null, "Cannot be Blank or Letter", "System Admin", JOptionPane.WARNING_MESSAGE);
                tx.setText("");
                tx.requestFocus();

            }

        }

    }

     public static  String dayNow() {
       String date="";
       Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

       date=ft.format(dNow);

       return date;
    }


     public static void  deleteTableRows(JTable jTable1){

           DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int ar[] = jTable1.getSelectedRows();

        for (int i = 0; i <= ar.length; i++) {
            if (i == 0) {
                dtm.removeRow(ar[i]);
            } else {
                dtm.removeRow(ar[i] - i);

            }

        }
     }


     public  static void tableHederBold(JTable jTable){

     JTableHeader heder = jTable.getTableHeader();
        heder.setFont(new Font("", Font.BOLD, 14));
     }
}
