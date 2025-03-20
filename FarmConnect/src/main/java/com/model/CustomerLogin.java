package com.model;

public class CustomerLogin {
	
	private String customerEmailId;
	private String customerPassword;
	
	
	public CustomerLogin() {
	}


	public CustomerLogin(String customerEmailId, String customerPassword) {
		super();
		this.customerEmailId = customerEmailId;
		this.customerPassword = customerPassword;
	}


	public String getCustomerEmailId() {
		return customerEmailId;
	}


	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}


	public String getCustomerPassword() {
		return customerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
 
	


}
