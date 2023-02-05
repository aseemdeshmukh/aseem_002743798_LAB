/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author AseemD
 */
public class CreateJPanel extends javax.swing.JPanel {

    private Application application;
    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(Application application) {
        initComponents();
        this.application = application;
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
        addObservationbtn = new javax.swing.JButton();
        fieldObservationId = new javax.swing.JTextField();
        fieldTemperature = new javax.swing.JTextField();
        fieldBloodPressure = new javax.swing.JTextField();

        setBackground(new java.awt.Color(236, 240, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("CREATE A VITAL SIGN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 20));

        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel3.setText("TEMPERATURE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jLabel4.setText("BLOOD PRESSURE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        addObservationbtn.setText("ADD OBSERVATION");
        addObservationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObservationbtnActionPerformed(evt);
            }
        });
        add(addObservationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));
        add(fieldObservationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 80, 30));

        fieldTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTemperatureActionPerformed(evt);
            }
        });
        add(fieldTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, 30));
        add(fieldBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void addObservationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObservationbtnActionPerformed
        // TODO add your handling code here:
        
        // ADD OBSERVATION TO VITAL SIGNS HISTORY
        
        VitalSignHistory history = this.application.getHistory();
        
        // READ TEXT FIELDS
        
        String id = fieldObservationId.getText();
        String temperature = fieldTemperature.getText();
        String bloodPressure = fieldBloodPressure.getText();
        
        // convert/cast pass
        
        history.createObservation(Integer.valueOf(id), Double.valueOf(bloodPressure), Double.valueOf(temperature));
        JOptionPane.showMessageDialog(null, "Added Observation!!");
        
        
    }//GEN-LAST:event_addObservationbtnActionPerformed

    private void fieldTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTemperatureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addObservationbtn;
    private javax.swing.JTextField fieldBloodPressure;
    private javax.swing.JTextField fieldObservationId;
    private javax.swing.JTextField fieldTemperature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
