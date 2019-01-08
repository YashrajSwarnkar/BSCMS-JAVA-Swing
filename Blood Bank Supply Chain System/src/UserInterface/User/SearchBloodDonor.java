/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.User;

import Business.Connection.Connection;
import Business.Email;
import Business.Hospital.Hospital;
import Business.Network;
import Business.User.User;
import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author barua
 */
public class SearchBloodDonor extends javax.swing.JPanel {

    /**
     * Creates new form SearchBloodDonor
     */
    private JPanel userProcessContainer;
    private Network network;
    private User user;

    SearchBloodDonor(JPanel userProcessContainer, Network network, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.user = user;
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addToConnectionButton = new javax.swing.JButton();
        zipCode_jComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donorzip_jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchBloodDonorButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bloodGroupComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        hospitalzip_jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addToConnectionButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addToConnectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Valid-Green-icon.png"))); // NOI18N
        addToConnectionButton.setText("Send Request");
        addToConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToConnectionButtonActionPerformed(evt);
            }
        });
        add(addToConnectionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 354, 141, -1));

        zipCode_jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        zipCode_jComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zipCode_jComboBoxMouseClicked(evt);
            }
        });
        add(zipCode_jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 92, 140, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 36)); // NOI18N
        jLabel2.setText("Search NearBy Blood Donor");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        donorzip_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donar Name", "Donar Blood Group", "Donor Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donorzip_jTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 147, 460, 166));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Zip Code : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 95, 79, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Fast-Rewind-icon.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 354, -1, -1));

        searchBloodDonorButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchBloodDonorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Search-icon.png"))); // NOI18N
        searchBloodDonorButton.setText("Search Blood Donor");
        searchBloodDonorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBloodDonorButtonActionPerformed(evt);
            }
        });
        add(searchBloodDonorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Blood Group");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 91, 80, 23));

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(bloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 92, 150, -1));

        hospitalzip_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Hospital Address", "Hospital Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(hospitalzip_jTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 147, 649, 166));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void addToConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToConnectionButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowofUserTable = donorzip_jTable.getSelectedRow();
        int selectedRowofHospitalTable = hospitalzip_jTable.getSelectedRow();
        if (selectedRowofUserTable >= 0) {
            int token = 0;
            if (selectedRowofHospitalTable >= 0) {
                User selectedUser = (User) donorzip_jTable.getValueAt(selectedRowofUserTable, 0);
                Hospital selectedHospital = (Hospital) hospitalzip_jTable.getValueAt(selectedRowofHospitalTable, 2);
                for(Connection outerConnection : network.getConnectionDirectory().getConnectionDirectory())
                {    
                    if(outerConnection.getSenderUser().getEmailId().equals(user.getEmailId()) && outerConnection.getRecieverUser().getEmailId().equals(selectedUser.getEmailId()))
                    {
                        token = 1;
                        break;
                    }
                }   
                if(token == 0)
                {    
                Connection connetion = network.getConnectionDirectory().addConnection();
                connetion.setSenderUser(user);
                connetion.setRecieverUser(selectedUser);
                connetion.setStatus("Pending");
                connetion.setHospital(selectedHospital);
                connetion.setHospitalStatus("Received");
                connetion.setAppointmentDate(null);
                connetion.setAssignee(null);
                String emailTo = "barua.m@husky.neu.edu";
                String subject = "Blood Supply Chain Management System : Require Blood";
                String body = "Dear,"+selectedUser.getFullName()+" "+user.getFullName()+" has raised blood donation request. User requires "+selectedUser.getBloodGroup()+" in Zip Code "+user.getAddress().getZipCode()+". Hospital Details are : Hospital Name : "+selectedHospital.getHospitalName()+", Address : "+selectedHospital.getAddress()+", Contact Details : "+selectedHospital.getHospitalcontactNumber()+", Email ID "+selectedHospital.getHospitalemailId()+". If you are intrested to donate blood, Please go to portal and approve request for this user. Thank you";
                String emailFrom = "bscms2018@gmail.com";
                String password = "password@12345";
                Email email = network.getEmail();
                //boolean emailConfirmation = email.sendMail(emailTo, subject, body, password, emailFrom);
                JOptionPane.showMessageDialog(null, "Request has been sent to user");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Request already exist");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select hospital");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select Donor");
        }
    }//GEN-LAST:event_addToConnectionButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void zipCode_jComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zipCode_jComboBoxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCode_jComboBoxMouseClicked

    private void searchBloodDonorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBloodDonorButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel userTableModel = (DefaultTableModel) donorzip_jTable.getModel();
        userTableModel.setRowCount(0);
        String selectedZipCode = (String) zipCode_jComboBox.getSelectedItem();
        String selectedBloodGroup = (String) bloodGroupComboBox.getSelectedItem();
        for (User userdetails : network.getUserDirectory().getUserDirectory()) {
            if (selectedZipCode.equals(userdetails.getAddress().getZipCode()) && selectedBloodGroup.equals(userdetails.getBloodGroup())) {
                if (!(userdetails.getEmailId().equals(user.getEmailId()))) {
                    Object row[] = new Object[userTableModel.getColumnCount()];
                    row[0] = userdetails;
                    row[1] = userdetails.getBloodGroup();
                    row[2] = userdetails.getAddress().getZipCode();
                    userTableModel.addRow(row);
                }
            } else {
                continue;
            }
        }

        int rowCount = hospitalzip_jTable.getRowCount();
        DefaultTableModel hospitalTableModel = (DefaultTableModel) hospitalzip_jTable.getModel();
        hospitalTableModel.setRowCount(0);
        for (Hospital hospital : network.getHospitalDirectory().getHospitalDirectory()) {
            if (selectedZipCode.equals(hospital.getAddress().getZipCode())) {
                Object row[] = new Object[hospitalTableModel.getColumnCount()];
                row[0] = hospital.getHospitalName();
                row[1] = hospital.getAddress();
                row[2] = hospital;
                hospitalTableModel.addRow(row);
            } else {
                continue;
            }
        }

    }//GEN-LAST:event_searchBloodDonorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToConnectionButton;
    private javax.swing.JComboBox bloodGroupComboBox;
    private javax.swing.JTable donorzip_jTable;
    private javax.swing.JTable hospitalzip_jTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchBloodDonorButton;
    private javax.swing.JComboBox zipCode_jComboBox;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        zipCode_jComboBox.removeAllItems();

        DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) zipCode_jComboBox.getModel();
        for(User userDetails : network.getUserDirectory().getUserDirectory())
        {
            if(defaultComboBoxModel.getIndexOf(userDetails.getAddress().getZipCode()) == -1)
            {
                defaultComboBoxModel.addElement(userDetails.getAddress().getZipCode());
            }
        }

        bloodGroupComboBox.removeAllItems();
        bloodGroupComboBox.addItem("O+ve");
        bloodGroupComboBox.addItem("O-ve");
        bloodGroupComboBox.addItem("A+ve");
        bloodGroupComboBox.addItem("A-ve");
        bloodGroupComboBox.addItem("B+ve");
        bloodGroupComboBox.addItem("B-ve");
        bloodGroupComboBox.addItem("AB+ve");
        bloodGroupComboBox.addItem("AB-ve");
    }

    private void populatetable() {

    }
}
