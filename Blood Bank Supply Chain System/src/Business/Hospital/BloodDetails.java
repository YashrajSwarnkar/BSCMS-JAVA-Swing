/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.Date;

/**
 *
 * @author barua
 */
public class BloodDetails {
    
    private String bloodGroup;
    private String bloodBagId;
    private String donorName;
    private String donorSocialSecurityNumber;
    private Date collectionDate;
    private Date expiryDate;

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getBloodBagId() {
        return bloodBagId;
    }

    public void setBloodBagId(String bloodBagId) {
        this.bloodBagId = bloodBagId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorSocialSecurityNumber() {
        return donorSocialSecurityNumber;
    }

    public void setDonorSocialSecurityNumber(String donorSocialSecurityNumber) {
        this.donorSocialSecurityNumber = donorSocialSecurityNumber;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    @Override
    public String toString()
    {
        return bloodBagId;
    }
}
