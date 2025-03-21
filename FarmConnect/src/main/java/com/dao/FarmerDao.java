package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.model.Farmer;
import com.model.FarmerLogin;

@Service
public class FarmerDao {

    @Autowired
    private FarmerRepository repo;

    public Farmer addFarmer(Farmer farmer) {
        
    	BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encryptedPwd = bcrypt.encode(farmer.getFarmerPassword());
		farmer.setFarmerPassword(encryptedPwd);
		return repo.save(farmer);
    }

    public List<Farmer> getFarmers() {
        return repo.findAll();
    }

    public Farmer getFarmerById(int farmerId) {
        return repo.findById(farmerId).orElse(null);
    }

    public Farmer getFarmerByEmailId(String farmerEmailId) {
        return repo.findByEmailId(farmerEmailId);
    }

    public void deleteFarmerById(int farmerId) {
        repo.deleteById(farmerId);
    }

    public Farmer updateFarmer(Farmer farmer) {
        return repo.save(farmer);
    }

    public Farmer getFarmerByMobile(Long farmerMobile) {
        return repo.findByFarmerMobile(farmerMobile);
    }

    public Farmer setFarmerPassword(String farmerEmailId, String farmerPassword) {
        Farmer farmer = getFarmerByEmailId(farmerEmailId);

        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();		
		String encryptedPwd = bcrypt.encode(farmerPassword);		
		farmer.setFarmerPassword(encryptedPwd);

        return repo.save(farmer);
    }

    public List<Farmer> getFarmerByName(String farmerName) {
        return repo.getFarmerByName(farmerName);
    }

    public Farmer farmerLogin(FarmerLogin farmerLogin) {
        // Retrieve the farmer by email
        Farmer farmer = getFarmerByEmailId(farmerLogin.getFarmerEmailId());

        if (farmer == null) {
            return null; // Farmer not found
        }

        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
        boolean result = bcrypt.matches(farmerLogin.getFarmerPassword(), farmer.getFarmerPassword());

        return result ? farmer : null;
    }
}