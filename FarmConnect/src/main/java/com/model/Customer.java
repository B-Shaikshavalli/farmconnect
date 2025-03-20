package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private int    customerId;
	private String customerName;
	@Column(unique = true)
	private String customerEmailId;
	private String address;
	private String country;
	@Column(unique = true)
	private Long   customerMobile;
	private String    customerPassword;
	
	
	public Customer() {
	
	}


	public Customer(int customerId, String customerName, String customerEmailId, String address, String country,
			Long customerMobile, String customerPassword) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.address = address;
		this.country = country;
		this.customerMobile = customerMobile;
		this.customerPassword = customerPassword;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerEmailId() {
		return customerEmailId;
	}


	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Long getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(Long customerMobile) {
		this.customerMobile = customerMobile;
	}


	public String getCustomerPassword() {
		return customerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}



	

   
	
	
	
	
	

}
