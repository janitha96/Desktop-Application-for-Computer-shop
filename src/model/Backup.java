package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author Buddika
 */
public class Backup {

    private static ResultSet res;
    private static Connection con;
    private Statement st;
    private int BUFFER = 99999;

    public String getData(String host, String port, String user, String password, String db) {
        String Mysqlpath = getMysqlBinPath(user, password, db);
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("yaha dekho");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, user, password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        } catch (Exception e) {

            System.out.print("I am here yaaar");
            e.printStackTrace();
        }


        System.out.println("-------------------");
        System.out.println(Mysqlpath);
        System.out.println("-------------------");
        Process run = null;

        try {

            System.out.println("--------" + Mysqlpath + "mysqldump --host=" + host + " --port=" + port + " --user=" + user + " --password=" + password + " --compact --complete-insert --extended-insert " + "--skip-comments --skip-triggers " + db);
            System.out.println("xxxxxxxxxxxxx");
            run = Runtime.getRuntime().exec(Mysqlpath + "mysqldump --host=" + host + " --port=" + port + " --user=" + user + " --password=" + password + "  " + "--skip-comments --skip-triggers " + db);
            System.out.println("yyyyyyyyyyyy");
        } catch (IOException ex) {
            // Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
            // System.out.println("xxxxxxxxxxxxx");
        }



        InputStream in = run.getInputStream();
        // System.out.println("xxxxxxxxxxxxx");
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        StringBuffer temp = new StringBuffer();


        int count;
        char[] cbuf = new char[BUFFER];

        try {

            while ((count = br.read(cbuf, 0, BUFFER)) != -1) {
                temp.append(cbuf, 0, count);
            }
        } catch (IOException ex) {
            Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            br.close();
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(Backup.class.getName()).log(Level.SEVERE, null, ex);
        }

        return temp.toString();

    }

    public String getMysqlBinPath(String user, String password, String db) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("yaha dekho");
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db, user, password);
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        } catch (Exception e) {

            System.out.print("I am here yaaar");
            e.printStackTrace();
        }



        String a = "";


        try {

            // res = st.executeQuery("select * from student_data");
            res = st.executeQuery("select @@basedir");
            //   System.out.println("xxxxxxxxxxxxxxxxxx");
            while (res.next()) {
                a = res.getString(1);
            }
        } catch (Exception eee) {
            eee.printStackTrace();
        }
        a = a + "bin\\";
        //   a     =  "C:\\Users\\Madusha\\Desktop\\database_backup ";
        System.err.println("Mysql path is :" + a);
        return a;

    }

    public static String getBackUpPath() {

        String backUpPath = "";
        JFileChooser fc = null;
        if (fc == null) {
            fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setAcceptAllFileFilterUsed(false);
        }
        int returnVal = fc.showDialog(null, "Open");
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            backUpPath = file.getAbsolutePath();
        }
        return backUpPath;
    }

    public static void back_up_method(String backup_path) {

        String s = new Date().toString();
        String date_name[] = s.split(" ");
        String date = date_name[0] + "-" + date_name[1] + "-" + date_name[2] + "-" + date_name[5];
        System.out.println(date_name[0] + "-" + date_name[1] + "-" + date_name[2] + "-" + date_name[5] + "|" + date_name[3]);

        //String backuppath=jTextField5.getText();
        String Database = "acc";
        String Password = "isknh";
        String user = "root";
        // System.out.println(new Date());

        model.Backup b = new model.Backup();
        //Backup b = new Backup();
        try {
            byte[] data = b.getData("localhost", "3306", user, Password, Database).getBytes();
            File filedst = new File(backup_path + "\\" + date + ".zip");
            FileOutputStream dest = new FileOutputStream(filedst);
            ZipOutputStream zip = new ZipOutputStream(
                    new BufferedOutputStream(dest));
            zip.setMethod(ZipOutputStream.DEFLATED);
            zip.setLevel(Deflater.BEST_COMPRESSION);
            zip.putNextEntry(new ZipEntry("data.sql"));
            zip.write(data);
            zip.close();
            dest.close();

//            String isuru=backup_path + "\\" + date + ".zip";
//            String sampath=backup_path;
//            
//            Model.UnZip.INPUT_ZIP_FILE=isuru;
//              Model.UnZip.OUTPUT_FOLDER=sampath;
//              Model.UnZip.unZipIt(isuru, sampath);

//        File filedst = new File(backup_path+"\\"+date+".sql");
//       FileOutputStream dest = new FileOutputStream(filedst);
//       ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream(dest));
//       zip.setMethod(ZipOutputStream.DEFLATED);
//       zip.setLevel(Deflater.BEST_COMPRESSION);
//       zip.putNextEntry(new ZipEntry("data.sql"));
//       zip.write(data);
//       zip.close();
//       dest.close();
            //JOptionPane.showMessageDialog(null, "Back Up Successfully."+"\n"+"For Database: "+Database+"\n        "+"On Dated: ","Database BackUp Wizard",JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null, "Successfully backedup", "Database Administrator", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Back Up Failed."+"\n"+"For Database: "+Database+"\n "+"On     Dated: ","Database BackUp Wizard",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Sorry backup wasn't successful", "Database Administrator", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }

    public static void do_restore(String path_back_up) {
        String path1 = null;
        try {
            //Backup b = new Backup();
            String databaseName = "acc";//database name
            String userName = "root";//username of mysql
            String password = "isknh";//password of myql
            int processComplete;// this variable for verify the process
            //String new_path = path_back_up
            System.out.println(path_back_up);


//            Connection con = controll.Db.con();
//            ResultSet rs = con.createStatement().executeQuery("Select * from dbpath where id='1'");
//            while (rs.next()) {
//                path1 = rs.getString("path");
//
//            }

//   String x = "C:\\Program Files (x86)\\MySQL\\MySQL Server 5.1\\bin\\mysql";
path1="C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\\mysql";
            String x = path1;


            System.out.println("pathiiiiii" + path1);
            String[] executeCmd = new String[]{x, databaseName, "--user=" + userName, "--password=" + password, "-e", " source " + path_back_up};
            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            processComplete = runtimeProcess.waitFor();
            System.out.println("-----------------------------------------");
            System.out.println(processComplete);

            if (processComplete == 1) {// if return value equal to 1 then failed the process
                JOptionPane.showMessageDialog(null, "Restore Failed");
            } else if (processComplete == 0) {
                {// if return value equal to 0 then failed the process
                    JOptionPane.showMessageDialog(null, "Restore Completed");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
