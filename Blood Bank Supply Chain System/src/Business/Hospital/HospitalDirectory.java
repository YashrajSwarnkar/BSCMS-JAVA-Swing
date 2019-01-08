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
public class HospitalDirectory {
    ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory() {
        hospitalDirectory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital addHospital()
    {
        Hospital hospital = new Hospital();
        hospitalDirectory.add(hospital);
        return hospital;
    }
}
