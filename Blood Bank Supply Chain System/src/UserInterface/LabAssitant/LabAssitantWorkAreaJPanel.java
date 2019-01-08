/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssitant;

import Business.Hospital.Hospital;
import Business.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTextWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.DoctorRole.ViewBloodDonationRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barua
 */
public class LabAssitantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssitantWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Network network;
    private UserAccount userAccount;
    private LabOrganization labOrganization;
    private Hospital hospital;

  

    public LabAssitantWorkAreaJPanel(JPanel userProcessContainer, Network network, Organization organization, UserAccount userAccount, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.labOrganization = (LabOrganization) organization;
        this.userAccount = userAccount;
        this.hospital = hospital;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : labOrganization.getWorkQueue().getWorkqueue()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getEmployeeName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmployeeName();
            row[3] = request.getStatus();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        viewBloodDonationRequestJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message ", "Sender", "Reciever", "Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 151, 490, 289));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Loop-On-icon.png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 140, -1));

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assignJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Add-icon.png"))); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        processJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Play-Green-icon.png"))); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        viewBloodDonationRequestJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        viewBloodDonationRequestJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Favorite-icon.png"))); // NOI18N
        viewBloodDonationRequestJButton.setText("View Blood Donation Request");
        viewBloodDonationRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBloodDonationRequestJButtonActionPerformed(evt);
            }
        });
        add(viewBloodDonationRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel3.setText("View Blood Request ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        LabTextWorkRequest request = (LabTextWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void viewBloodDonationRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBloodDonationRequestJButtonActionPerformed
        // TODO add your handling code here:
        ViewBloodDonationRequestForLab viewBloodDonationRequestForlab = new ViewBloodDonationRequestForLab(userProcessContainer, network, hospital, labOrganization, userAccount);
        userProcessContainer.add("ViewBloodDonationRequestForLab",viewBloodDonationRequestForlab);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewBloodDonationRequestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewBloodDonationRequestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
