/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class OrganizationDirectory {

    ArrayList<Organization> organizationDirectory;

    public OrganizationDirectory() {

        organizationDirectory = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(ArrayList<Organization> organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization organization = null;
        if(type.getValue().equalsIgnoreCase(Type.Doctor.getValue()))
        {
            organization = new DoctorOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equalsIgnoreCase(Type.Lab.getValue()))
        {
            organization = new LabOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equalsIgnoreCase(Type.Admin.getValue()))
        {
            organization = new AdminOrganization();
            organizationDirectory.add(organization);
        }
        return organization;
    }
}
