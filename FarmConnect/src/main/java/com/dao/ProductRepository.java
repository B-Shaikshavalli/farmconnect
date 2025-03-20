package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{

	@Query("from Products where name = :pName")
	Optional<Products> getproductByName(@Param("pName") String prdtName);
	
	

}
