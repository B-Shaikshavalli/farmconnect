package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dao.FarmerDao;
import com.model.Farmer;
import com.model.FarmerLogin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FarmerController {

    @Autowired
    private FarmerDao dao;

    @GetMapping("getFarmers")
    public List<Farmer> getFarmers() {
        return dao.getFarmers();
    }

    @PostMapping("addFarmer")
    public Farmer addFarmer(@RequestBody Farmer farmer) {
        return dao.addFarmer(farmer);
    }

    @GetMapping("getFarmerById/{id}")
    public Farmer getFarmerById(@PathVariable("id") int farmerId) {
        return dao.getFarmerById(farmerId);
    }

    @GetMapping("getFarmerByEmailId/{farmerEmailId}")
    public Farmer getFarmerByEmailId(@PathVariable("farmerEmailId") String farmerEmailId) {
        return dao.getFarmerByEmailId(farmerEmailId);
    }

    @DeleteMapping("deleteFarmerById/{id}")
    public String deleteFarmerById(@PathVariable("id") int farmerId) {
        dao.deleteFarmerById(farmerId);
        return "Farmer record with FarmerId: " + farmerId + " deleted successfully.";
    }

    @PutMapping("updateFarmer")
    public Farmer updateFarmer(@RequestBody Farmer farmer) {
        return dao.updateFarmer(farmer);
    }

    @GetMapping("getFarmerMobile/{farmerMobile}")
    public Farmer getFarmerByMobile(@PathVariable("farmerMobile") Long farmerMobile) {
        return dao.getFarmerByMobile(farmerMobile);
    }

    @GetMapping("getFarmerByName/{farmerName}")
    public List<Farmer> getFarmerByName(@PathVariable("farmerName") String farmerName) {
        return dao.getFarmerByName(farmerName);
    }

    @PostMapping("setFarmerPassword")
    public Farmer setFarmerPassword(@RequestBody FarmerLogin farmerLogin) {
        return dao.setFarmerPassword(farmerLogin.getFarmerEmailId(), farmerLogin.getFarmerPassword());
    }

    @PostMapping("farmerLogin")
    public Farmer farmerLogin(@RequestBody FarmerLogin farmerLogin) {
        return dao.farmerLogin(farmerLogin);
    }
}