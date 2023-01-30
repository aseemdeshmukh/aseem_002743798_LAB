/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;

/**
 *
 * @author AseemD
 */
public class ViewJPanel extends javax.swing.JPanel {

    private DeliveryPackage delPackage;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel() {
        initComponents();
    }

    ViewJPanel(DeliveryPackage deliveryPackage){
     initComponents();
        
        this.delPackage = deliveryPackage;
        display();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        productId1 = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        custName1 = new javax.swing.JTextField();
        custId = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Package ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setText("Weight");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("ProdID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setText("Prod Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel5.setText("Prod Price");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel6.setText("Customer Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel7.setText("ID");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 120, -1));
        add(packageWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));
        add(productId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, -1));
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 120, -1));
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 120, -1));
        add(custName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 110, -1));

        custId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIdActionPerformed(evt);
            }
        });
        add(custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void display() {
        packageId.setText(String.valueOf(this.delPackage.getPackageId()));
        packageWt.setText(String.valueOf(this.delPackage.getPackageWeight()));
        
        Customer customer = this.delPackage.getCustomer();
        custId.setText(String.valueOf(customer.getCustomerId()));
        custName1.setText(customer.getName());
        
    }
    
    private void custIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JTextField productId1;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    // End of variables declaration//GEN-END:variables
}
