/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.main;

import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import view.enquiry.CustomerTracking;
import static view.enquiry.CustomerTracking.jComboBoxCustomerSearch;

import static view.enquiry.CustomerTracking.jComboBoxSearchItem;

/**
 *
 * @author Isuru Sampath
 */
public class Main extends javax.swing.JFrame {

    public static Color FormColor = new Color(140, 205, 250);
    public static Color lblFontColor = new Color(0, 0, 0);
    Dimension screenSize = getToolkit().getScreenSize();
    //  String lookAndFeel = "de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel";
  


   public static JInternalFrame customerEnquiry = new view.enquiry.CustomerEnquiry();
    public static JInternalFrame customerTracking = new view.enquiry.CustomerTracking();
    public static JInternalFrame itemTracking = new view.enquiry.ItemTracker();
    public static JInternalFrame priceEnquiry = new view.enquiry.PriceEnquiry();
    public static JInternalFrame forwardDeliveries = new view.inventory.ForwardDeliveries();
//    public static JInternalFrame grn = new Sample.GRN();
    public static JInternalFrame damageInform = new view.inventory.DamageInform();
    public static JInternalFrame itemRequestNote = new view.inventory.ItemRequestNote();
    public static JInternalFrame mrn = new view.inventory.MRN();
    public static JInternalFrame stockInward = new view.inventory.StockInward();
    public static JInternalFrame stockoutward = new view.inventory.StockOutward();
    public static JInternalFrame advanceRecipt = new view.sales.AdvanceRecipt();
    public static JInternalFrame extendedWarranty = new view.sales.ExtendedWarranty();
    public static JInternalFrame invoice = new view.sales.Invoice();
    public static JInternalFrame quatation = new view.sales.Quatation();
    public static JInternalFrame refund = new view.sales.Refund();
    public static JInternalFrame creditSettlment = new view.sales.CreditSettlment();
    public static JInternalFrame newJob = new view.service.NewJob();
    public static JInternalFrame replacement = new view.service.Replacement();

//    public static JInternalFrame cassing = new view.admin.CassingRegister();
//    public static JInternalFrame dvdRomRegister = new view.admin.DvdRomRegister();
//    public static JInternalFrame hardDiskRegister = new view.admin.HardDiskRegister();
//    public static JInternalFrame keyboardRegister = new view.admin.KeyboardRegister();
//    public static JInternalFrame laptopRegiater = new view.admin.LaptopRegiater();
//    public static JInternalFrame MonitorRegister = new view.admin.MonitorRegister();
//    public static JInternalFrame motherboardRegister = new view.admin.MotherboardRegister();
//    public static JInternalFrame mouseRegister = new view.admin.MouseRegister();
//    public static JInternalFrame powerSupplyRegister = new view.admin.PowerSupplyRegister();
//    public static JInternalFrame processorRegister = new view.admin.ProcessorRegister();
//    public static JInternalFrame ramRegister = new view.admin.RamRegister();
//    public static JInternalFrame vgaRegister = new view.admin.VgaRegister();
    public static JInternalFrame itemRegister = new view.admin.ItemRegister();
    public static JInternalFrame accCleakRefund = new view.admin.AccClearkRefund();
    public static JInternalFrame priceRegister = new view.admin.PriceRegister();
    public static JInternalFrame replacementApproval = new view.admin.ReplacementApproval();
    public static JInternalFrame dailyCashBlance = new view.sales.DailyCashBlance();

    public static JInternalFrame supplierCreation = new view.popupWindows.SupplierCreation();
    public static JInternalFrame customerDetais = new view.popupWindows.CustomerPopup();
    public static JInternalFrame receiptDetails = new view.popupWindows.ReceiptPopup();
    public static JInternalFrame invoiceDetais = new view.popupWindows.InvoicePopup();
    public static JInternalFrame customerCreation = new view.popupWindows.CustomerCreation();
    public static JInternalFrame itemDetails = new view.popupWindows.ItemPopup();
    public static JInternalFrame MRNDetails = new view.popupWindows.MRNPopup();
    public static JInternalFrame supplierDetails = new view.popupWindows.SupplierPopup();
    public static JInternalFrame purchaseOrderDetails = new view.popupWindows.PurchaseOrderPopup();
    public static JInternalFrame JobDetails = new view.popupWindows.JobPopup();
    public static JInternalFrame GRNDetails = new view.popupWindows.GRNPopup();

//    public static JInternalFrame advanceReceiptDetails = new view.popupWindows.AdvanceReceiptPopup();
    public static JInternalFrame soldItemsDetailsReports = new view.reports.inventory.SoldItemsDetailsReports();
    public static JInternalFrame stockBlanceReports = new view.reports.inventory.StockBlanceReports();
    public static JInternalFrame movementDetailsReports = new view.reports.inventory.MovementDetailsReports();
    public static JInternalFrame exchangDetailsReports = new view.reports.inventory.ExchangDetailsReports();
    public static JInternalFrame cashSaleDetailsReports = new view.reports.sales.CashSaleDetailsReports();
    public static JInternalFrame advanceReceiptsDetailsReports = new view.reports.sales.AdvanceReceiptsDetailsReports();
    public static JInternalFrame remittanceDetailsReports = new view.reports.sales.RemittanceDetailsReports();
    public static JInternalFrame refundDetailsReports = new view.reports.sales.RefundDetailsReports();
    public static JInternalFrame totalItemSalesReports = new view.reports.sales.TotalItemSalesReports();
    public static JInternalFrame profitDetailsReports = new view.reports.sales.ProfitDetailsReports();
    public static JInternalFrame pendingJobsReports = new view.reports.service.PendingJobsReports();
    public static JInternalFrame completeJobsReports = new view.reports.service.CompleteJobsReports();

    public static JInternalFrame grn = new view.admin.GRN();
    public static JInternalFrame purchaseOrder = new view.admin.PurchaseOrder();
    public static JInternalFrame creditCustomerApproval = new view.admin.CreditCustomerApproval();
    public static JInternalFrame stockTransfer = new view.admin.StockTransfer();
    public static JInternalFrame creditCustomerCreation = new view.sales.CreditCustomerCreation();

    public Main() {

        initComponents();
        System.out.println(System.getProperty("user.dir"));
//      try {
//            File f2 = new File("D:\\SOFTWARES\\PROGRAMING\\PROJECTS\\New\\PC Station\\src\\Images\\PC Station with logo1.png");
//                Image img = ImageIO.read(f2);
//                img = img.getScaledInstance(1366, 720, Image.SCALE_SMOOTH);
//                jLabel1.setIcon(new ImageIcon(img));  
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        model.Themes.setFullScreen(screenSize, this);
        System.out.println(model.Themes.loadTheme());

        jDesktopPane1.add(customerEnquiry);
        customerEnquiry.setVisible(false);
        jDesktopPane1.add(customerTracking);
        customerTracking.setVisible(false);
        jDesktopPane1.add(itemTracking);
        itemTracking.setVisible(false);

        jDesktopPane1.add(priceEnquiry);
        priceEnquiry.setVisible(false);

        jDesktopPane1.add(forwardDeliveries);
        forwardDeliveries.setVisible(false);

        jDesktopPane1.add(grn);
        grn.setVisible(false);

        jDesktopPane1.add(itemRequestNote);
        itemRequestNote.setVisible(false);

        jDesktopPane1.add(mrn);
        mrn.setVisible(false);

        jDesktopPane1.add(stockInward);
        stockInward.setVisible(false);

        jDesktopPane1.add(stockoutward);
        stockoutward.setVisible(false);

        jDesktopPane1.add(advanceRecipt);
        advanceRecipt.setVisible(false);
//       
        jDesktopPane1.add(extendedWarranty);
        extendedWarranty.setVisible(false);

        jDesktopPane1.add(invoice);
        invoice.setVisible(false);

        jDesktopPane1.add(quatation);
        quatation.setVisible(false);

        jDesktopPane1.add(refund);
        refund.setVisible(false);

        jDesktopPane1.add(creditSettlment);
        creditSettlment.setVisible(false);

        jDesktopPane1.add(newJob);
        newJob.setVisible(false);

        jDesktopPane1.add(replacement);
        replacement.setVisible(false);

//        jDesktopPane1.add(cassing);
//        cassing.setVisible(false);
//
//        jDesktopPane1.add(dvdRomRegister);
//        dvdRomRegister.setVisible(false);
//
//        jDesktopPane1.add(hardDiskRegister);
//        hardDiskRegister.setVisible(false);
//
//        jDesktopPane1.add(keyboardRegister);
//        keyboardRegister.setVisible(false);
//
//        jDesktopPane1.add(laptopRegiater);
//        laptopRegiater.setVisible(false);
//
//        jDesktopPane1.add(MonitorRegister);
//        MonitorRegister.setVisible(false);
//
//        jDesktopPane1.add(motherboardRegister);
//        motherboardRegister.setVisible(false);
//
//        jDesktopPane1.add(mouseRegister);
//        mouseRegister.setVisible(false);
//
//        jDesktopPane1.add(powerSupplyRegister);
//        powerSupplyRegister.setVisible(false);
//
//        jDesktopPane1.add(processorRegister);
//        processorRegister.setVisible(false);
//
//        jDesktopPane1.add(ramRegister);
//        ramRegister.setVisible(false);
//
//        jDesktopPane1.add(vgaRegister);
//        vgaRegister.setVisible(false);
        jDesktopPane1.add(itemRegister);
        itemRegister.setVisible(false);

        jDesktopPane1.add(accCleakRefund);
        accCleakRefund.setVisible(false);

        jDesktopPane1.add(priceRegister);
        priceRegister.setVisible(false);
/////////////////////////////////////////////////////////////////////

        jDesktopPane1.add(invoiceDetais);
        invoiceDetais.setVisible(false);

        jDesktopPane1.add(receiptDetails);
        receiptDetails.setVisible(false);

        jDesktopPane1.add(customerCreation);
        customerCreation.setVisible(false);

        jDesktopPane1.add(customerDetais);
        customerDetais.setVisible(false);

        jDesktopPane1.add(itemDetails);
        itemDetails.setVisible(false);

        jDesktopPane1.add(MRNDetails);
        MRNDetails.setVisible(false);

        jDesktopPane1.add(supplierDetails);
        supplierDetails.setVisible(false);

        jDesktopPane1.add(purchaseOrderDetails);
        purchaseOrderDetails.setVisible(false);

        jDesktopPane1.add(JobDetails);
        JobDetails.setVisible(false);

        jDesktopPane1.add(GRNDetails);
        GRNDetails.setVisible(false);

        jDesktopPane1.add(supplierCreation);
        supplierCreation.setVisible(false);

////////////////////////////////////////////////////////////////////////
        jDesktopPane1.add(replacementApproval);
        replacementApproval.setVisible(false);

        jDesktopPane1.add(dailyCashBlance);
        dailyCashBlance.setVisible(false);

        jDesktopPane1.add(soldItemsDetailsReports);
        soldItemsDetailsReports.setVisible(false);

        jDesktopPane1.add(stockBlanceReports);
        stockBlanceReports.setVisible(false);

        jDesktopPane1.add(movementDetailsReports);
        movementDetailsReports.setVisible(false);

        jDesktopPane1.add(exchangDetailsReports);
        exchangDetailsReports.setVisible(false);

        jDesktopPane1.add(cashSaleDetailsReports);
        cashSaleDetailsReports.setVisible(false);

        jDesktopPane1.add(advanceReceiptsDetailsReports);
        advanceReceiptsDetailsReports.setVisible(false);

        jDesktopPane1.add(remittanceDetailsReports);
        remittanceDetailsReports.setVisible(false);

        jDesktopPane1.add(refundDetailsReports);
        refundDetailsReports.setVisible(false);

        jDesktopPane1.add(totalItemSalesReports);
        totalItemSalesReports.setVisible(false);

        jDesktopPane1.add(profitDetailsReports);
        profitDetailsReports.setVisible(false);

        jDesktopPane1.add(pendingJobsReports);
        pendingJobsReports.setVisible(false);

        jDesktopPane1.add(completeJobsReports);
        completeJobsReports.setVisible(false);

        jDesktopPane1.add(damageInform);
        damageInform.setVisible(false);

        jDesktopPane1.add(purchaseOrder);
        purchaseOrder.setVisible(false);

        jDesktopPane1.add(creditCustomerCreation);
        creditCustomerCreation.setVisible(false);

        jDesktopPane1.add(stockTransfer);
        stockTransfer.setVisible(false);

        jDesktopPane1.add(creditCustomerApproval);
        creditCustomerApproval.setVisible(false);

        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
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
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemItemRegister = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenuItem70 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();

        jMenuItem50.setText("jMenuItem50");

        jMenuItem54.setText("jMenuItem54");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PC Station");
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu3.setText("Themes");

        jMenuItem4.setText("Standard");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Pain");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Blue Light");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Alu Oxide");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Classy");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Black Eye");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Simple 2D");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Wite Vision");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Sky Metallic");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setText("Mauve Metallic");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setText("Oranage Metallic");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Blue Steel");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuItem16.setText("Black Moon");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem16);

        jMenuItem17.setText("Blue Moon");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);

        jMenuItem18.setText("Silver Moon");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuItem19.setText("Blue Ice");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuItem20.setText("Green Dream");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenuItem21.setText("Black Star");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Enquiry");

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem22.setText("Customer Enquiry");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem22);

        jMenuItem23.setText("Customer Tracker");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem23);

        jMenuItem24.setText("Item Tracker");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem24);

        jMenuItem25.setText("Price Enquiry");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem25);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sales");

        jMenuItem26.setText("Invoice");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem26);

        jMenuItem27.setText("Advance Receipt");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem27);

        jMenuItem28.setText("Quatation");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem28);

        jMenuItem29.setText("Refund");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem29);

        jMenuItem30.setText("Extended Waranty");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem30);

        jMenuItem37.setText("Credit Settlment");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem37);

        jMenuItem53.setText("Daily Cash Balance");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem53);

        jMenuItem71.setText("CreditCustomerCreation");
        jMenuItem71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem71ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem71);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Inventory");

        jMenuItem31.setText("Forward Deliveries");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem31);

        jMenuItem32.setText("Item Request");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem32);

        jMenuItem33.setText("MRN");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem33);

        jMenuItem34.setText("Stock Inward");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem34);

        jMenuItem35.setText("Stock Outward");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem35);

        jMenuItem68.setText("Damage Inform");
        jMenuItem68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem68ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem68);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Service");

        jMenuItem38.setText("new Job");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem38);

        jMenuItem39.setText("Replacement");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem39);

        jMenuBar1.add(jMenu7);

        jMenuAdmin.setText("Admin");

        jMenuItemItemRegister.setText("Item Register");
        jMenuItemItemRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemItemRegisterActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemItemRegister);

        jMenuItem41.setText("Refund Approval");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem41);

        jMenuItem42.setText("Price Register");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem42);

        jMenuItem52.setText("Replacement Approval");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem52);

        jMenuItem36.setText("GRN");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem36);

        jMenuItem69.setText("Purchase Order");
        jMenuItem69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem69ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem69);

        jMenuItem70.setText("Credit Customer Approval");
        jMenuItem70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem70ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem70);

        jMenuItem1.setText("Stock Transfer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem1);

        jMenuBar1.add(jMenuAdmin);

        jMenu10.setText("Reports");

        jMenu11.setText("Inventory Reports");

        jMenuItem55.setText("Sold Item Details");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem55);

        jMenuItem56.setText("Stock Balance ");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem56);

        jMenuItem57.setText("Movement Details");
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem57);

        jMenuItem58.setText("Exchange Details");
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem58);

        jMenu10.add(jMenu11);

        jMenu12.setText("Sales Reports");

        jMenuItem59.setText("Sales Details");
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem59);

        jMenuItem60.setText("Advance Receipt Details");
        jMenuItem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem60ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem60);

        jMenuItem61.setText("Cash Balance Details");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem61);

        jMenuItem62.setText("Remittance Details");
        jMenuItem62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem62ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem62);

        jMenuItem63.setText("Refund Details");
        jMenuItem63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem63ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem63);

        jMenuItem64.setText("Total Item Sales Details");
        jMenuItem64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem64ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem64);

        jMenuItem65.setText("Profit Details");
        jMenuItem65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem65ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem65);

        jMenu10.add(jMenu12);

        jMenu13.setText("Service Reports");

        jMenuItem66.setText("Pending Job details");
        jMenuItem66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem66ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem66);

        jMenuItem67.setText("Complete Job details");
        jMenuItem67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem67ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem67);

        jMenu10.add(jMenu13);

        jMenuBar1.add(jMenu10);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        jMenu9.setText("Help");
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        model.Themes.changeScreenSize(this, evt, screenSize, jLabel1);

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

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        String theameName = "de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel";
        model.Themes.saveTheme(theameName);
        model.Themes.changeLookandFeel(this, model.Themes.loadTheme());
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        try {
            customerEnquiry.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.customerEnquiry.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.customerDetais, view.enquiry.CustomerEnquiry.jComboBoxCustomerSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.invoiceDetais, view.enquiry.CustomerEnquiry.jComboBoxInvoiceSearch, screenSize);

    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        try {
            customerTracking.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();

        view.main.Main.customerTracking.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.itemDetails, jComboBoxSearchItem, screenSize);
        repaint();
        revalidate();
        model.Themes.setPopupWindows(view.main.Main.customerDetais, jComboBoxCustomerSearch, screenSize);


    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        try {
            itemTracking.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.itemTracking.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.enquiry.ItemTracker.jComboBoxItemSearch, screenSize);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        try {
            priceEnquiry.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.priceEnquiry.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.enquiry.PriceEnquiry.jComboBoxItemSearch, screenSize);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        try {
            invoice.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.invoice.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.sales.Invoice.jComboBoxItemSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.customerDetais, view.sales.Invoice.jComboBoxCustomerSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.invoiceDetais, view.sales.Invoice.jComboBoxInvoiceSearch, screenSize);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        try {
            advanceRecipt.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.advanceRecipt.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.receiptDetails, view.sales.AdvanceRecipt.jComboBoxReceiptSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.sales.AdvanceRecipt.jComboBoxItemSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.customerDetais, view.sales.AdvanceRecipt.jComboBoxCustomerSearch, screenSize);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        try {
            quatation.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.quatation.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.sales.Quatation.jComboBoxItemSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.customerDetais, view.sales.Quatation.jComboBoxCustomerSearch, screenSize);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        try {
            refund.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.refund.setVisible(true);


    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        try {
            extendedWarranty.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.extendedWarranty.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.invoiceDetais, view.sales.ExtendedWarranty.jComboBoxInvoiceSearch, screenSize);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        try {
            forwardDeliveries.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.forwardDeliveries.setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        try {
            itemRequestNote.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.itemRequestNote.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.invoiceDetais, view.inventory.ItemRequestNote.jComboBoxInvoiceSearch, screenSize);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        try {
            mrn.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.mrn.setVisible(true);

//        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.inventory.MRN.jComboBoxItemSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.MRNDetails, view.inventory.MRN.jComboBoxMRNSearch, screenSize);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        try {
            stockInward.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.stockInward.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        try {
            stockoutward.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.stockoutward.setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        try {
            newJob.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.newJob.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.invoiceDetais, view.service.NewJob.jComboBoxInvoiceSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.JobDetails, view.service.NewJob.jComboBoxJobSearch, screenSize);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        try {
            replacement.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.replacement.setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        try {
            dailyCashBlance.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.dailyCashBlance.setVisible(true);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        try {
            soldItemsDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.soldItemsDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        try {
            stockBlanceReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.stockBlanceReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
        try {
            movementDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.movementDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem57ActionPerformed

    private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
        try {
            exchangDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.exchangDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem58ActionPerformed

    private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem59ActionPerformed
        try {
            cashSaleDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.cashSaleDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem59ActionPerformed

    private void jMenuItem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem60ActionPerformed
        try {
            advanceReceiptsDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.advanceReceiptsDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem60ActionPerformed

    private void jMenuItem62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem62ActionPerformed
        try {
            remittanceDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.remittanceDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem62ActionPerformed

    private void jMenuItem63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem63ActionPerformed
        try {
            refundDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.refundDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem63ActionPerformed

    private void jMenuItem64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem64ActionPerformed
        try {
            totalItemSalesReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.totalItemSalesReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem64ActionPerformed

    private void jMenuItem65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem65ActionPerformed
        try {
            profitDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.profitDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem65ActionPerformed

    private void jMenuItem66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem66ActionPerformed
        try {
            pendingJobsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.pendingJobsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem66ActionPerformed

    private void jMenuItem67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem67ActionPerformed
        try {
            completeJobsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.completeJobsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem67ActionPerformed

    private void jMenuItem68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem68ActionPerformed
        try {
            damageInform.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.damageInform.setVisible(true);
        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.inventory.DamageInform.jComboBoxItemSearch, screenSize);
    }//GEN-LAST:event_jMenuItem68ActionPerformed

    private void jMenuItem71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem71ActionPerformed
        try {
            creditCustomerCreation.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.creditCustomerCreation.setVisible(true);
    }//GEN-LAST:event_jMenuItem71ActionPerformed

    private void jMenuItem70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem70ActionPerformed
        try {
            creditCustomerApproval.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.creditCustomerApproval.setVisible(true);
        model.Themes.setPopupWindows(view.main.Main.customerDetais, view.admin.CreditCustomerApproval.jComboBoxCustomerSearch, screenSize);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem70ActionPerformed

    private void jMenuItem69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem69ActionPerformed
        try {
            purchaseOrder.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.purchaseOrder.setVisible(true);     // TODO add your handling code here:

        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.admin.PurchaseOrder.jComboBoxItemSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.purchaseOrderDetails, view.admin.PurchaseOrder.jComboBoxPoSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.supplierDetails, view.admin.PurchaseOrder.jComboBoxSupplierSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.MRNDetails, view.admin.PurchaseOrder.jComboBoxMRNSearch, screenSize);

    }//GEN-LAST:event_jMenuItem69ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        try {
            grn.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.grn.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.supplierDetails, view.admin.GRN.jComboBoxSupplierSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.purchaseOrderDetails, view.admin.GRN.jComboBoxPoSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.GRNDetails, view.admin.GRN.jComboBoxGRNSearch, screenSize);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        try {
            replacementApproval.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.replacementApproval.setVisible(true);
        model.Themes.setPopupWindows(view.main.Main.JobDetails, view.admin.ReplacementApproval.jComboBoxJobSearch, screenSize);
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        try {
            priceRegister.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.priceRegister.setVisible(true);

        model.Themes.setPopupWindows(view.main.Main.itemDetails, view.admin.PriceRegister.jComboBoxItemSearch, screenSize);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        try {
            accCleakRefund.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.accCleakRefund.setVisible(true);
//          model.Themes.setPopupWindows(view.main.Main.JobDetails, view.admin.ReplacementApproval.jComboBoxJobSearch, screenSize);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItemItemRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemItemRegisterActionPerformed
        try {
            itemRegister.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.itemRegister.setVisible(true);
    }//GEN-LAST:event_jMenuItemItemRegisterActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        try {
            creditSettlment.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.creditSettlment.setVisible(true);
        model.Themes.setPopupWindows(view.main.Main.invoiceDetais, view.sales.CreditSettlment.jComboBoxInvoiceSearch, screenSize);
        model.Themes.setPopupWindows(view.main.Main.supplierDetails, view.sales.CreditSettlment.jComboBoxSupplierSearch, screenSize);

    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            stockTransfer.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main.stockTransfer.setVisible(true);
         model.Themes.setPopupWindows(view.main.Main.itemDetails, view.admin.StockTransfer.jComboBoxItemSearch, screenSize);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem61ActionPerformed
       try {
            cashSaleDetailsReports.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.Themes.hideInternalFrame();
        view.main.Main. cashSaleDetailsReports.setVisible(true);
    }//GEN-LAST:event_jMenuItem61ActionPerformed

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
                new Main().setVisible(true);
            }
        });
    }

//public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MediaPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        </editor-fold>
//        </editor-fold>
//
//        /* Create and display the form */
//        UIUtils.setPreferredLookAndFeel();
//
//        NativeInterface.open();
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
////                MediaPlayer mp = new MediaPlayer();
////                mp.getContentPane().add(new SimpleWMediaPlayerExample(), BorderLayout.CENTER);
////                mp.setLocationByPlatform(true);
//              new Main().setVisible(true);
//
//            }
//        });
//        NativeInterface.runEventPump();
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemItemRegister;
    // End of variables declaration//GEN-END:variables
}
