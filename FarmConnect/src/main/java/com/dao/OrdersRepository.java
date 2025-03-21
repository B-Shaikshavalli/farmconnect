package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	@Query("from Orders where customer.customerId = :custId")
	List<Orders> getOrderByCustomerId(@Param("custId") int customerId);

}