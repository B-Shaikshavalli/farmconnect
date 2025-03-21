package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer, Integer> {

    @Query("from Farmer where farmerEmailId = :farmerEmailId")
    Farmer findByEmailId(@Param("farmerEmailId") String farmerEmailId);

    @Query("from Farmer where farmerEmailId = :farmerEmailId and farmerPassword = :farmerPassword")
    Farmer farmerLogin(@Param("farmerEmailId") String farmerEmailId, @Param("farmerPassword") String farmerPassword);

    @Query("from Farmer where farmerMobile = :farmerMobile")
    Farmer findByFarmerMobile(@Param("farmerMobile") Long farmerMobile);

    @Query("from Farmer where farmerName = :farmerName")
    List<Farmer> getFarmerByName(@Param("farmerName") String farmerName);
}