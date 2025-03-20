package com.model;

public class FarmerLogin {
    
    private String farmerEmailId;
    private String farmerPassword;
    
    
    
    public FarmerLogin() {
    }

    public FarmerLogin(String farmerEmailId, String farmerPassword) {
        this.farmerEmailId = farmerEmailId;
        this.farmerPassword = farmerPassword;
    }

    public String getFarmerEmailId() {
        return farmerEmailId;
    }

    public void setFarmerEmailId(String farmerEmailId) {
        this.farmerEmailId = farmerEmailId;
    }

    public String getFarmerPassword() {
        return farmerPassword;
    }

    public void setFarmerPassword(String farmerPassword) {
        this.farmerPassword = farmerPassword;
    }

}