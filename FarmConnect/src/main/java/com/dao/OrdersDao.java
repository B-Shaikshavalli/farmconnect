package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.Orders;

@Service
public class OrdersDao {

    @Autowired
    OrdersRepository orderRepo;
    
    @Autowired
    CustomerDao custDao;

    public Orders addOrder(Orders orders) {
    	
    	Customer customer = custDao.getCustomerByEmailId(orders.getEmailId());
    	orders.setCustomer(customer);
        return orderRepo.save(orders);
    }

    public List<Orders> getOrders() {
        return orderRepo.findAll();
    }

    public Orders getOrderById(int orderId) {
        return orderRepo.findById(orderId).orElse(null);
    }

    public void deleteOrderById(int orderId) {
        orderRepo.deleteById(orderId);
    }

	public List<Orders> getOrderByEmailId(String emailId) {
		Customer customer = custDao.getCustomerByEmailId(emailId);
		
		return orderRepo.getOrderByCustomerId(customer.getCustomerId());
	}
}