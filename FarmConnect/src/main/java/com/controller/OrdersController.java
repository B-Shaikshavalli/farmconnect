package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dao.OrdersDao;
import com.model.Orders;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class OrdersController {

    @Autowired
    OrdersDao ordersDao;

    @PostMapping("addOrder")
    public Orders addOrder(@RequestBody Orders order) {
        return ordersDao.addOrder(order);
    }

    @GetMapping("getOrders")
    public List<Orders> getOrders() {
        return ordersDao.getOrders();
    }
    
    @GetMapping("getOrderByEmailId/{id}")
    public List<Orders> getOrderByEmailId(@PathVariable("id") String emailId) {
        return ordersDao.getOrderByEmailId(emailId);
    }

    @GetMapping("getOrderById/{id}")
    public Orders getOrderById(@PathVariable("id") int orderId) {
        return ordersDao.getOrderById(orderId);
    }

    @DeleteMapping("deleteOrderById/{id}")
    public String deleteOrderById(@PathVariable("id") int orderId) {
        ordersDao.deleteOrderById(orderId);
        return "Order Deleted Successfully!";
    }
}
