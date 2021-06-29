/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CBC
 */
public class Db {

    static Connection c;

    public static Connection con() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "isknh");


        } catch (Exception e) {

            e.printStackTrace();
        }


        return c;

    }
}
