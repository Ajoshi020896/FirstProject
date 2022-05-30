package com.practice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Entity.Product;
import com.practice.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
    @PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {

		return service.saveProduct(product);
	}
    @PostMapping("/addProducts")
	public Iterable<Product> addProducts(@RequestBody Iterable<Product> products) {
		
		return service.saveProducts(products);
	}
    @GetMapping("/products")
    public Iterable<Product> findAllProducts(){
    	
    	return service.getProducts();
    	
    }
    @GetMapping("productById/{id}")
    public Product findProductById(@PathVariable int id) {
    	
    	return service.getProductById(id);
    	
    }
    @GetMapping("product/{name}")
    public Product findProductByNameProduct(@PathVariable String name) {
    	
    	return service.getProductByNameProduct(name);
    }
    @DeleteMapping("delete/{id}")
    public String deleteProductString(@PathVariable int id) {
    	
    	return service.deleteProduct(id);
    	
    	
    }
	

}
