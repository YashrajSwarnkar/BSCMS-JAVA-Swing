/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Hospital.Hospital;
import Business.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author barua
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Network network, Hospital hospital) {
        return new AdminWorkAreaJPanel(userProcessContainer, network, organization, hospital, account);
    }
    
}
