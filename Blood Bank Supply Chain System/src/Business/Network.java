/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Connection.Connection;
import Business.Connection.ConnectionDirectory;
import Business.Connection.HospitalConnectionDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class Network extends Organization{

    UserDirectory userDirectory;
    HospitalDirectory hospitalDirectory;
    ConnectionDirectory connectionDirectory;
    HospitalConnectionDirectory hospitalConnectionDirectory;
    Email email;

    private static Network network;

    private Network() {
        super(null);
        userDirectory = new UserDirectory();
        hospitalDirectory = new HospitalDirectory();
        connectionDirectory = new ConnectionDirectory();
        hospitalConnectionDirectory = new HospitalConnectionDirectory();
        email = new Email();
    }
    
    public static Network getInstance() {
        if (network == null) {
            network = new Network();
        }
        return network;

    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public ConnectionDirectory getConnectionDirectory() {
        return connectionDirectory;
    }

    public HospitalConnectionDirectory getHospitalConnectionDirectory() {
        return hospitalConnectionDirectory;
    }

    public void setHospitalConnectionDirectory(HospitalConnectionDirectory hospitalConnectionDirectory) {
        this.hospitalConnectionDirectory = hospitalConnectionDirectory;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

}
