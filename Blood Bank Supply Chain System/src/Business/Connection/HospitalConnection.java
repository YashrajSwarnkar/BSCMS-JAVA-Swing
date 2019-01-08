/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Connection;

import Business.Hospital.Hospital;
import Business.UserAccount.UserAccount;

/**
 *
 * @author barua
 */
public class HospitalConnection {
    
    private Hospital senderHospital;
    private Hospital receiverHospital;
    private String connectionStatus;
    private String bloodGroup;
    private UserAccount approvedBy;

    public Hospital getSenderHospital() {
        return senderHospital;
    }

    public void setSenderHospital(Hospital senderHospital) {
        this.senderHospital = senderHospital;
    }

    public Hospital getReceiverHospital() {
        return receiverHospital;
    }

    public void setReceiverHospital(Hospital receiverHospital) {
        this.receiverHospital = receiverHospital;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public UserAccount getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(UserAccount approvedBy) {
        this.approvedBy = approvedBy;
    }
    
    @Override
    public String toString()
    {
        return connectionStatus;
    }
}
