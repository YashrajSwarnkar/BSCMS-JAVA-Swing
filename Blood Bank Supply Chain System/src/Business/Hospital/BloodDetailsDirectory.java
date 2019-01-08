/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class BloodDetailsDirectory {
    
    ArrayList<BloodDetails> bloodDetailsDirectory;

    public BloodDetailsDirectory() {
        bloodDetailsDirectory = new ArrayList<BloodDetails>();
    }
    
    public ArrayList<BloodDetails> getBloodDetailsDirectory() {
        return bloodDetailsDirectory;
    }

    public void setBloodDetailsDirectory(ArrayList<BloodDetails> bloodDetailsDirectory) {
        this.bloodDetailsDirectory = bloodDetailsDirectory;
    }
    
    public BloodDetails addBloodDetails()
    {
        BloodDetails bloodDetails = new  BloodDetails();
        bloodDetailsDirectory.add(bloodDetails);
        return bloodDetails;
    }
    
}
