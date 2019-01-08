/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Address.Address;
import Business.Employee.Employee;
import Business.Hospital.BloodDetails;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Hospital.Inventory;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.User.UserDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author barua
 */
public class ConfigureBusiness {
    
    public static Network configure()
    {
     
        Network network = Network.getInstance();
        //Creating a system user :
        Employee employee = network.getEmployeeDirectory().createEmployee("sysadmin");
        network.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
         
        // Create a new hospital with an admin
        Hospital hospital = network.getHospitalDirectory().addHospital();
        hospital.setHospitalName("Apollo");
        Address address = new Address();
        address.setStreetAddress("49 Symphony Road");
        address.setCity("Boston");
        address.setZipCode("02115");
        address.setState("MA");
        address.setCountry("USA");
        hospital.setHospitalcontactNumber("0987654321");
        hospital.setHospitalemailId("apollo@gmail.com");
        hospital.setAddress(address);
        Organization adminOrganization = hospital.getOrganizationDirectory().createOrganization(Organization.Type.Admin);
        Employee hospitalemployee = network.getEmployeeDirectory().createEmployee("sysadmin");
        adminOrganization.getUserAccountDirectory().createUserAccount("admin", "admin", hospitalemployee, new AdminRole());    
        
        
        return network;
    }

}
