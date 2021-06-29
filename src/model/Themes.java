/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import static java.awt.Frame.ICONIFIED;
import static java.awt.Frame.NORMAL;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Isuru Sampath
 */
public class Themes {

    public static Color FormColor = new Color(140, 205, 250);
    public static Color lblFontColor = new Color(0, 0, 0);
    static int i = 1;

    public static void changeScreenSize(JFrame aThis, WindowEvent evt, Dimension screenSize, JLabel jLabel1) {
        if (evt.getNewState() == 6) {
            if (i == 2) {
                i = 1;
                aThis.setMinimumSize(new Dimension(screenSize));
                aThis.setSize(screenSize);
                System.out.println("if");
                try {
//                    File f2 = new File("D:\\SOFTWARES\\PROGRAMING\\PROJECTS\\New\\PC Station\\src\\Images\\PC Station with logo1.png");
//                    Image img = ImageIO.read(f2);
//                    img = img.getScaledInstance(1366, 720, Image.SCALE_SMOOTH);
//                    jLabel1.setIcon(new ImageIcon(img));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                i = 2;
                aThis.setMinimumSize(new Dimension(1000, 600));
                aThis.setSize(1000, 600);

                aThis.setLocation(((screenSize.width) / 2) - 500, ((screenSize.height) / 2) - 300);

                try {
//                    File f2 = new File("D:\\SOFTWARES\\PROGRAMING\\PROJECTS\\New\\PC Station\\src\\Images\\PC Station with logo1.png");
//                    Image img = ImageIO.read(f2);
//                    img = img.getScaledInstance(1000, 550, Image.SCALE_SMOOTH);
//                    jLabel1.setIcon(new ImageIcon(img));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }

    public static void changeLookandFeel(JFrame aThis, String lookAndFeel) {
        try {

            UIManager.removeAuxiliaryLookAndFeel(UIManager.getLookAndFeel());
            SyntheticaLookAndFeel.setWindowsDecorated(true);
            UIManager.setLookAndFeel(lookAndFeel);

            for (int i = 0; i < aThis.getFrames().length; ++i) {
                SwingUtilities.updateComponentTreeUI(aThis.getFrames()[i]);
                SwingUtilities.updateComponentTreeUI(aThis);
            }
            SwingUtilities.updateComponentTreeUI(aThis);

        } catch (Exception ex) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void setFullScreen(Dimension screenSize, JFrame aThis) {
        aThis.setSize(screenSize);
        aThis.setAlwaysOnTop(true);
        aThis.setLocation(0, 0);
        aThis.setMinimumSize(new Dimension(screenSize));
    }

    public static void saveTheme(String theme) {
        final String dir = System.getProperty("user.dir");

        System.out.println("current dir = " + dir);

        try {
            FileOutputStream fileStream = new FileOutputStream(dir + "/theam.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(theme);

            os.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static String loadTheme() {
        final String dir = System.getProperty("user.dir");
        String theme = null;
        try {
            ObjectInput objectInput = new ObjectInputStream(new FileInputStream(dir + "/theam.ser"));
            theme = objectInput.readObject().toString().trim();
            objectInput.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return theme;
    }

    public static void checkScreenSize(Dimension screenSize, JFrame jframe, Dimension scr) {
        if (scr.height > 600 && scr.width > 1000) {
            jframe.setSize(screenSize);
            jframe.setMinimumSize(screenSize);
            jframe.setLocation(0, 0);

        } else {
            jframe.setSize(1000, 600);
            jframe.setMinimumSize(new Dimension(1000, 600));
            jframe.setLocation(((screenSize.width) / 2) - 500, ((screenSize.height) / 2) - 300);

        }
    }

    public static void hideInternalFrame() {
        view.main.Main.customerEnquiry.setVisible(false);
        view.main.Main.customerTracking.setVisible(false);
        view.main.Main.itemTracking.setVisible(false);
        view.main.Main.priceEnquiry.setVisible(false);

        view.main.Main.forwardDeliveries.setVisible(false);
        view.main.Main.grn.setVisible(false);
        view.main.Main.itemRequestNote.setVisible(false);
        view.main.Main.mrn.setVisible(false);
        view.main.Main.stockInward.setVisible(false);
        view.main.Main.stockoutward.setVisible(false);

        view.main.Main.advanceRecipt.setVisible(false);
        view.main.Main.extendedWarranty.setVisible(false);
        view.main.Main.invoice.setVisible(false);
        view.main.Main.quatation.setVisible(false);
        view.main.Main.refund.setVisible(false);
        view.main.Main.creditSettlment.setVisible(false);

        view.main.Main.newJob.setVisible(false);
        view.main.Main.replacement.setVisible(false);

        view.main.Main.invoiceDetais.setVisible(false);
        view.main.Main.receiptDetails.setVisible(false);

//        view.main.Main.cassing.setVisible(false);
//        view.main.Main.dvdRomRegister.setVisible(false);
//        view.main.Main.hardDiskRegister.setVisible(false);
//        view.main.Main.laptopRegiater.setVisible(false);
//        view.main.Main.MonitorRegister.setVisible(false);
//        view.main.Main.motherboardRegister.setVisible(false);
//        view.main.Main.mouseRegister.setVisible(false);
//        view.main.Main.powerSupplyRegister.setVisible(false);
//        view.main.Main.processorRegister.setVisible(false);
//        view.main.Main.ramRegister.setVisible(false);
//        view.main.Main.vgaRegister.setVisible(false);
//        view.main.Main.itemDetails.setVisible(false);
//        view.main.Main.customerCreation.setVisible(false);
//        view.main.Main.customerDetais.setVisible(false);
//        view.main.Main.invoiceDetais.setVisible(false);
//        view.main.Main.receiptDetails.setVisible(false);
        view.main.Main.itemRegister.setVisible(false);
        view.main.Main.accCleakRefund.setVisible(false);
        view.main.Main.priceRegister.setVisible(false);
        view.main.Main.replacementApproval.setVisible(false);
        view.main.Main.dailyCashBlance.setVisible(false);
        view.main.Main.soldItemsDetailsReports.setVisible(false);
        view.main.Main.stockBlanceReports.setVisible(false);
        view.main.Main.exchangDetailsReports.setVisible(false);
        view.main.Main.cashSaleDetailsReports.setVisible(false);
        view.main.Main.advanceReceiptsDetailsReports.setVisible(false);
        view.main.Main.remittanceDetailsReports.setVisible(false);
        view.main.Main.refundDetailsReports.setVisible(false);
        view.main.Main.totalItemSalesReports.setVisible(false);
        view.main.Main.profitDetailsReports.setVisible(false);
        view.main.Main.pendingJobsReports.setVisible(false);
        view.main.Main.completeJobsReports.setVisible(false);
        view.main.Main.damageInform.setVisible(false);
        view.main.Main.creditCustomerCreation.setVisible(false);
        view.main.Main.creditCustomerApproval.setVisible(false);
        view.main.Main.purchaseOrder.setVisible(false);
         view.main.Main.stockTransfer.setVisible(false);

    }

    public static void setPopupWindows(JInternalFrame jInternalFrame, JComboBox<String> jComboBox1, Dimension screenSize) {
        jInternalFrame.setLayer(1);
        jInternalFrame.setMaximumSize(new Dimension(500, 300));
        jInternalFrame.setSize(new Dimension(500, 300));
        jInternalFrame.setLocation((screenSize.width / 2) - 250, (screenSize.height / 2) - 150);

        JTextField textField;

        textField = (JTextField) jComboBox1.getEditor().getEditorComponent();
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {

                        System.out.println(e.getKeyChar());
                        if (e.getKeyCode() == 10) {
                            System.out.println("Enter key pressed");
                            view.main.Main.invoiceDetais.setVisible(false);
                            view.main.Main.receiptDetails.setVisible(false);
                            jInternalFrame.setVisible(true);

                        }
                    }
                });
            }

        });
    }

    public static void SetNormalpopupWindow(JInternalFrame jInternalFrame, Dimension screenSize) {
        jInternalFrame.setLayer(1);
        jInternalFrame.setMaximumSize(new Dimension(500, 300));
        jInternalFrame.setSize(new Dimension(500, 300));
        jInternalFrame.setLocation((screenSize.width / 2) - 250, (screenSize.height / 2) - 150);
        jInternalFrame.setVisible(true);
    }

}
