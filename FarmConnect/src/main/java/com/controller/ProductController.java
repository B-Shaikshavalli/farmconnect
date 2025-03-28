package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.model.Products;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProductController {
	
	@Autowired
	ProductDao pdao;
	
	
	@GetMapping("getProducts")
	public List<Products> getProducts() {
		return pdao.getProducts();
	}
	
	@GetMapping("getProductById/{prdtId}")
	public Products getProductById(@PathVariable("prdtId") int id) {
		return pdao.getProductById(id);
	}
	
	@GetMapping("getProductByName/{ProductName}")
	public Products getProductByName(@PathVariable("ProductName") String prdtName) {
		return pdao.getProductByName(prdtName);	
	}
	@PostMapping("addProduct")
	public Products addProduct(@RequestBody Products prdt) {		
		return pdao.addProduct(prdt); 
	}
	@PutMapping("updateProduct")
	public Products updateProduct(@RequestBody Products prdt) {		
		return pdao.updateProduct(prdt);
	}	
	
	@DeleteMapping("deleteProductById/{id}")
	public String deleteProductById(@PathVariable("id") int prdtId) {
		pdao.deleteProductById(prdtId);
		return "product Deleted Successfully!!!";
	}	


}
