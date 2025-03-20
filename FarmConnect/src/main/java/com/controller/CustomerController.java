package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.model.Customer;
import com.model.CustomerLogin;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerDao dao;
	
	@GetMapping("getCustomers")
	public List<Customer> getcustomer(){
		return dao.getcustomer();
	}
	
	@PostMapping("addCustomer")
	public Customer addcustomer (@RequestBody Customer cust) {
		return dao.addcustomer(cust);
		
	}	
	
	@GetMapping("getCustomerbyId/{id}")
	public Customer getCustomerById(@PathVariable("id") int CustomerId) {
		return dao.getCustomerById(CustomerId);
	}
	
	@GetMapping("getEmployeeByEmailId/{customerEmailId}")
	public Customer getCustomerByEmailId(@PathVariable("customerEmailId") String CustomeremailId) {
		return dao.getCustomerByEmailId(CustomeremailId);
	}
	
	@DeleteMapping("deleteCustomerById/{id}")
	public String deleteCustomerById(@PathVariable("id") int CustomerId) {
		dao.deleteCustomerById(CustomerId);
		return "Customer Record with CustomerId: " + CustomerId + ", Deleted Successfully";
	}
	
	@PutMapping("updateCustomer")
	public Customer updateCustomer(@RequestBody Customer Customer) {
		return dao.updateCustomere(Customer);
	}
	
	
	@GetMapping("getCustomerMobile/{customerMobile}")
	public Customer getCustomerById(@PathVariable("customerMobile") Long customerMobile) {
		return dao.getCustomerMobile(customerMobile);
	}
	 

	@GetMapping("getCustomerByName/{customerName}")
	public List<Customer> getcustomerByName(@PathVariable("customerName") String customerName) {
		return dao.getCustomerByName(customerName);
	}

	
	
	@PostMapping("setPassword")
	public Customer setPassword(@RequestBody CustomerLogin custLogin) {
		return dao.setcustomerPassword(custLogin.getCustomerEmailId(), custLogin.getCustomerPassword());
	}
	 
	
	
	@PostMapping("custLogin")
	public Customer custLogin(@RequestBody CustomerLogin custLogin) {	//Normal password	
		return dao.custLogin(custLogin);
	}

}
