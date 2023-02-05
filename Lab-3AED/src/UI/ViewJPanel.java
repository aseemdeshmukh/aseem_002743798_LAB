/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Observation;
import Model.VitalSignHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AseemD
 */
public class ViewJPanel extends javax.swing.JPanel {

        private Application application;
        DefaultTableModel viewtableModel;
        Observation selectedObservation;
    /**
     * Creates new form ViewJPanel
     */
        ViewJPanel(Application application) {
        initComponents();
        this.application = application;
        this.viewtableModel = (DefaultTableModel) observationTable.getModel();
        displayObservations();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observationTable = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        viewObservationbtn = new javax.swing.JButton();
        fieldObservationId = new javax.swing.JTextField();
        fieldTemperature = new javax.swing.JTextField();
        fieldBloodPressure = new javax.swing.JTextField();

        setBackground(new java.awt.Color(251, 241, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel1.setText("VIEW & UPDATE A VITAL SIGN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setText("TEMPERATURE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setText("BLOOD PRESSURE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        observationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Temperature", "BP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(observationTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 230, 190));

        updatebtn.setText("UPDATE OBSERVATION");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        viewObservationbtn.setText("VIEW DETAILS");
        viewObservationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewObservationbtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewObservationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));
        jPanel1.add(fieldObservationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 80, 30));
        jPanel1.add(fieldTemperature, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 80, 30));
        jPanel1.add(fieldBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewObservationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewObservationbtnActionPerformed
        // TODO add your handling code here:
        
        // what was clicked? Get the row in the table that was clicked
        
        int selectedRow = observationTable.getSelectedRow();
        
        if(selectedRow >= 0){
            
            // WE CAN DIRECTLY FETCH OBSERVATION OBJ FROM 0TH POSITION
          //  Observation observation = (Observation)observationTable.getValueAt(selectedRow, 0);
            
            // fill all text fields
            
            this.selectedObservation = (Observation) observationTable.getValueAt(selectedRow,0);

            fieldObservationId.setText(String.valueOf(selectedObservation.getObservationId()));
            fieldBloodPressure.setText(String.valueOf(selectedObservation.getBloodPressure()));
            fieldTemperature.setText(String.valueOf(selectedObservation.getTemperature()));
            
            
        } else{
            // NO SELECTION MADE BY USER
            JOptionPane.showMessageDialog(null, "Please select row");
        }
        
        
    }//GEN-LAST:event_viewObservationbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        
           // Update the observation
        Observation o = this.application.getHistory().findObservation(Integer.valueOf(fieldObservationId.getText()));
        o.setBloodPressure(Double.valueOf(fieldBloodPressure.getText()));
        
        o.setTemperature(Double.valueOf(fieldTemperature.getText()));
        
        // 
        this.selectedObservation.setBloodPressure(Double.valueOf(fieldBloodPressure.getText()));
        this.selectedObservation.setTemperature(Double.valueOf(fieldTemperature.getText()));
        
    }//GEN-LAST:event_updatebtnActionPerformed

    public void displayObservations(){
        VitalSignHistory history = this.application.getHistory();
        
        if(history.getVitalSignHistory().size()>0){
            //display
            viewtableModel.setRowCount(0);
            for (Observation o : history.getVitalSignHistory()){
               // System.out.println(o.getObservationId());
                
                Object row[] = new Object[3];
                row[0] = o;
                row[1] = o.getTemperature();
                row[2] = o.getBloodPressure();
                
                // add row to table
                
                viewtableModel.addRow(row);
            }
        }
            else{
                    System.out.print("Empty list");
                    }
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldBloodPressure;
    private javax.swing.JTextField fieldObservationId;
    private javax.swing.JTextField fieldTemperature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable observationTable;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton viewObservationbtn;
    // End of variables declaration//GEN-END:variables
}
