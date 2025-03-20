package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query("from Customer where customerEmailId = :customerEmailId")
	Customer findByEmailId(@Param("customerEmailId") String customerEmailId);
	
	@Query("from Customer where customerEmailId = :customerEmailId and customerPassword = :customerPassword")
	Customer custLogin( @Param("customerMobile")String customerMobile,@Param("customerPassword") String customerPassword);

	@Query("from Customer where customerMobile = :customerMobile")
	Customer customerMobile(@Param("customerMobile") Long customerMobile);

	@Query("from Customer where customerName = :customerName")
	List<Customer> getCustomerByName(@Param("customerName") String custmerName);

	
}
 