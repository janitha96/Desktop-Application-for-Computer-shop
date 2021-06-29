/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.Db;
import eu.hansolo.steelseries.extras.Led;
import eu.hansolo.steelseries.tools.LedColor;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Isuru Sampath
 */
public class UserAccount {
    public static void userNameValidation(JTextField jTextFieldUserName, JComboBox<String> jComboBoxAccountType, JPasswordField jPasswordFieldNewPassword, Led led,Led ledre,JPasswordField reTypePassword,JButton jButtonCreateAccount) {

        try {
            Connection con = control.Db.con();
            String sql = "SELECT * FROM user_account WHERE acc_type='" + jComboBoxAccountType.getSelectedItem().toString() + "' AND user_name='" + jTextFieldUserName.getText() + "'";
            ResultSet rs = con.createStatement().executeQuery(sql);

            if (rs.next() || jTextFieldUserName.getText().trim().length() < 6) {

                led.setLedOn(true);
                led.setLedColor(LedColor.RED);

                if (!jTextFieldUserName.getText().equals("")) {
                    led.setVisible(true);
                } else {
                    led.setVisible(false);
                }

            } else {

                led.setLedOn(true);
                led.setLedColor(LedColor.GREEN);
                led.setVisible(true);
            }

            if (jTextFieldUserName.getText().trim().length() > 5) {
                jPasswordFieldNewPassword.setEnabled(true);

            } else {
                
                ledre.setVisible(false);
                jPasswordFieldNewPassword.setEnabled(false);
                jPasswordFieldNewPassword.setText(null);
                 reTypePassword.setEnabled(false);
                reTypePassword.setText(null);
                jButtonCreateAccount.setEnabled(false);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void passwordValidation(KeyEvent evt, JLabel jLabel5, JPasswordField jPasswordFieldNewPassword, JPasswordField jPasswordFieldReTypePassword, Led led) {
        int digitsCount, uppercaseLettersCount, specialCharactersCount, points = 0;
        if (jPasswordFieldNewPassword.getPassword().length >= 8) {
            jPasswordFieldReTypePassword.setEnabled(true);

        } else {
            jPasswordFieldReTypePassword.setEnabled(false);
            jPasswordFieldReTypePassword.setText(null);
        }

        digitsCount = getDigitCount(jPasswordFieldNewPassword);
        System.err.print(" Digits :" + digitsCount);

        uppercaseLettersCount = getUppercaseLettersCount(jPasswordFieldNewPassword);
        System.err.print(" Uppercase Letters Count :" + uppercaseLettersCount);

        specialCharactersCount = getspecialCharactersCount(jPasswordFieldNewPassword);
        System.err.println(" Special Characters Count :" + specialCharactersCount);

        if (digitsCount > 0) {
            points = points + 25;
        }
        if (uppercaseLettersCount > 0) {
            points = points + 25;
        }
        if (specialCharactersCount > 0) {
            points = points + 50;
        }
        System.out.println("   points" + points);

        if (points >= 75 && jPasswordFieldNewPassword.getText().trim().length() > 7) {
            led.setLedColor(LedColor.BLUE);
        } else if (points >= 50 && jPasswordFieldNewPassword.getText().trim().length() > 7) {
            led.setLedColor(LedColor.GREEN);
        } else if (points >= 25 && jPasswordFieldNewPassword.getText().trim().length() > 7) {
            led.setLedColor(LedColor.YELLOW);
        } else if (points > 0) {
            led.setLedColor(LedColor.RED);
        }

        if (!jPasswordFieldNewPassword.getText().equals("")) {
            led.setLedOn(true);
            led.setVisible(true);
        } else {
            led.setVisible(false);
        }

    }

    private static int getDigitCount(JPasswordField jPasswordFieldNewPassword) {
        int digitCount = 0;
        String password = jPasswordFieldNewPassword.getText();

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount = digitCount + 1;

            }
        }

        return digitCount;
    }

    private static int getUppercaseLettersCount(JPasswordField jPasswordFieldNewPassword) {
        int uppercaseLettersCount = 0;
        String password = jPasswordFieldNewPassword.getText();

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseLettersCount = uppercaseLettersCount + 1;

            }
        }

        return uppercaseLettersCount;
    }

    private static int getspecialCharactersCount(JPasswordField jPasswordFieldNewPassword) {
        int specialCharactersCount = 0;
        String str = jPasswordFieldNewPassword.getText();

        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);

        System.out.println(str);
        int count = 0;
        while (m.find()) {
            specialCharactersCount = specialCharactersCount + 1;

        }

        return specialCharactersCount;
    }

    public static void reTypePasswordValidation(JPasswordField jPasswordFieldNewPassword, JPasswordField jPasswordFieldReTypePassword, JButton jButtonCreateAccount) {
        if (jPasswordFieldNewPassword.getText().equals(jPasswordFieldReTypePassword.getText()) && !jPasswordFieldNewPassword.getText().equals("") && !jPasswordFieldReTypePassword.getText().equals("")) {
            jButtonCreateAccount.setEnabled(true);

        } else {
            jButtonCreateAccount.setEnabled(false);
        }
    }

    public static void saveAccount(JTextField jTextFieldUserName, JPasswordField jPasswordFieldNewPassword, JPasswordField jPasswordFieldReTypePassword, JComboBox<String> jComboBoxAccountType, JButton jButtonCreateAccount) {

        try {
            Connection con = Db.con();
            String sql = "INSERT INTO user_account(acc_type,user_name,password) values('" + jComboBoxAccountType.getSelectedItem().toString() + "','" + jTextFieldUserName.getText() + "','" + jPasswordFieldNewPassword.getText() + "') ";
            con.createStatement().executeUpdate(sql);
            con.close();
            JOptionPane.showMessageDialog(null, "Account Created Successfully ", "System Admin", JOptionPane.INFORMATION_MESSAGE);
            jComboBoxAccountType.setSelectedIndex(0);
            jTextFieldUserName.setText(null);
            jPasswordFieldNewPassword.setText(null);
            jPasswordFieldReTypePassword.setText(null);
            jComboBoxAccountType.requestFocus(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Account Created unsuccessful ", "System Admin", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }
}
