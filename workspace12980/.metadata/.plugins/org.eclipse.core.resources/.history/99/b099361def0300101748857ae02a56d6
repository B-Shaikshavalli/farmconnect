package com.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.CustomerLogin;

@Service
public class CustomerDao {
	
	@Autowired
	private CustomerRepository repo;
	

	public Customer addcustomer(Customer cust) {
		
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encryptedPwd = bcrypt.encode(cust.getCustomerPassword());
		cust.setCustomerPassword(encryptedPwd);
		return repo.save(cust);
	}


	public List<Customer> getcustomer() {
		return repo.findAll();
	}


	public Customer getCustomerById(int customerId) {
		return repo.findById(customerId).orElse(null);
	}


	public Customer getCustomerByEmailId(String customeremailId) {
		return repo.findByEmailId(customeremailId);
	}


	public void deleteCustomerById(int customerId) {
	   repo.deleteById(customerId);
		
	}

 
	public Customer updateCustomere(Customer customer) {
		return repo.save(customer);
	}


	public Customer getCustomerMobile(Long customerMobile) {
		return repo.customerMobile(customerMobile);
	}


	public Customer setcustomerPassword(String custoEmailId, String custoPassword) {
		Customer customer = getCustomerByEmailId(custoEmailId);

		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();		
		String encryptedPwd = bcrypt.encode(custoPassword);		
		customer.setCustomerPassword(encryptedPwd);
		
		return repo.save(customer);
 

	}


	public List<Customer> getCustomerByName(String customerName) {
		return repo.getCustomerByName(customerName);
	}


	public Customer custLogin(CustomerLogin custLogin) {
		//Customer - Encrypted Password
		Customer customer = getCustomerByEmailId(custLogin.getCustomerEmailId());
				
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		boolean result = bcrypt.matches(custLogin.getCustomerPassword(), customer.getCustomerPassword());
				
		if (result) {
			return customer;
		}
				
		return null;
	}

}
