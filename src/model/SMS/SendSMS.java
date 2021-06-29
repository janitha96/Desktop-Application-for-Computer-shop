package model.SMS;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lakdimuthu
 */
public class SendSMS {

    public static void main(String[] args) {
        try {
            new Sender("0758990184", "Your stock items are very low").send();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
