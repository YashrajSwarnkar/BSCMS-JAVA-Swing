/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Connection;

import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class HospitalConnectionDirectory {
    
    ArrayList<HospitalConnection> hospitalsConnectionDirectory;

    public HospitalConnectionDirectory() {
        hospitalsConnectionDirectory = new ArrayList<>();
    }

    public ArrayList<HospitalConnection> getHospitalsConnectionDirectory() {
        return hospitalsConnectionDirectory;
    }

    public void setHospitalsConnectionDirectory(ArrayList<HospitalConnection> hospitalsConnectionDirectory) {
        this.hospitalsConnectionDirectory = hospitalsConnectionDirectory;
    }  
    
    public HospitalConnection addHospitalConnection()
    {
        HospitalConnection hospitalConnection = new HospitalConnection();
        hospitalsConnectionDirectory.add(hospitalConnection);
        return hospitalConnection;
    }
}
