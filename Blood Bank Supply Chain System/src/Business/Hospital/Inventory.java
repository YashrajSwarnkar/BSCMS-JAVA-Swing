/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author barua
 */
public class Inventory {
    
    BloodDetailsDirectory bloodDetailsDirectory;

    public Inventory() {
        bloodDetailsDirectory = new BloodDetailsDirectory();
    }
    
    public BloodDetailsDirectory getBloodDetailsDirectory() {
        return bloodDetailsDirectory;
    }

    public void setBloodDetailsDirectory(BloodDetailsDirectory bloodDetailsDirectory) {
        this.bloodDetailsDirectory = bloodDetailsDirectory;
    }
}
