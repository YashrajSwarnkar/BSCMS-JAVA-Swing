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
import javax.swing.JPanel;
import UserInterface.LabAssitant.LabAssitantWorkAreaJPanel;

/**
 *
 * @author barua
 */
public class LabAssitantRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Network network, Hospital hospital) {
        return new LabAssitantWorkAreaJPanel(userProcessContainer, network,organization, userAccount, hospital);
    }
    
}
