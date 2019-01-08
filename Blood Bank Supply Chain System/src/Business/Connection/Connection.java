/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Connection;

import Business.Hospital.Hospital;
import Business.User.User;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author barua
 */
public class Connection {
    
    private User senderUser;
    private User recieverUser;
    private Hospital hospital;
    private String hospitalStatus;
    private Date appointmentDate;
    private String status;
    private UserAccount assignee;

    public User getSenderUser() {
        return senderUser;
    }

    public void setSenderUser(User senderUser) {
        this.senderUser = senderUser;
    }

    public User getRecieverUser() {
        return recieverUser;
    }

    public void setRecieverUser(User recieverUser) {
        this.recieverUser = recieverUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getHospitalStatus() {
        return hospitalStatus;
    }

    public void setHospitalStatus(String hospitalStatus) {
        this.hospitalStatus = hospitalStatus;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public UserAccount getAssignee() {
        return assignee;
    }

    public void setAssignee(UserAccount assignee) {
        this.assignee = assignee;
    }
    
    @Override
    public String toString()
    {
        return hospitalStatus;
    }
    
}
