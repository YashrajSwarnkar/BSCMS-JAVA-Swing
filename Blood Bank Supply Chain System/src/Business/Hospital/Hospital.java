/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Address.Address;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author barua
 */
public class Hospital {
    
    private String hospitalName;
    private Address address;
    private String hospitalemailId;
    private String hospitalcontactNumber;
    private Inventory inventory;
    private OrganizationDirectory organizationDirectory;

     public Hospital() {
        organizationDirectory = new OrganizationDirectory();
        inventory = new Inventory();
    }
    
    public String getHospitalemailId() {
        return hospitalemailId;
    }

    public void setHospitalemailId(String hospitalemailId) {
        this.hospitalemailId = hospitalemailId;
    }

    public String getHospitalcontactNumber() {
        return hospitalcontactNumber;
    }

    public void setHospitalcontactNumber(String hospitalcontactNumber) {
        this.hospitalcontactNumber = hospitalcontactNumber;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    } 
    
    public String toString() {        
    return hospitalemailId;
  }
}