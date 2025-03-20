package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Products;

@Service
public class ProductDao {
	
	@Autowired
	ProductRepository prepo;

	public List<Products> getProducts() {
		return prepo.findAll();
	}

	public Products getProductById(int id) {
		return prepo.findById(id).orElse(null);

	}
 
	public Products getProductByName(String prdtName) {
		return  prepo.getproductByName(prdtName).orElse(null);

	}

	public Products addProduct(Products prdt) {
		return prepo.save(prdt);
	}

	public Products updateProduct(Products prdt) {
		return prepo.save(prdt);
	}

	public void deleteProductById(int prdtId) {
		prepo.deleteById(prdtId);
	}

}
