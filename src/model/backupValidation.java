/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Buddika
 */
public class backupValidation {
     public static void check_field_is_empty(String back_up_path,int x){

        if (back_up_path.isEmpty()) {
            //view.error.back_up.error(, , );//call the jop
            JOptionPane.showMessageDialog(null,"Sorry you need to specify the path before create backup","Database Administration",JOptionPane.ERROR_MESSAGE);
        } else {
            if (x==1) {
//                controll.Backup.back_up_method(back_up_path);
              model.Backup.back_up_method(back_up_path);
            } else {
              //  controll.Backup.do_restore(back_up_path);
           model.Backup.do_restore(back_up_path);

            }

        }
    }
}
