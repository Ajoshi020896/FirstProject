package com.practice.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Entity.Product;
import com.practice.Repository.ProductRepository;

import antlr.collections.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {

		return repository.save(product);

	}

	public Iterable<Product> saveProducts(Iterable<Product> products) {

		return repository.saveAll(products);

	}

	public Iterable<Product> getProducts() {

		return repository.findAll();
	}

	public Product getProductById(int id) {

		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByNameProduct(String name) {

		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		
		repository.deleteById(id);
		return "product removed !!"+ id;
	}
	
//	public String updateProduct(Product product) {
//		
//		Optional<Product> existingProduct=repository.findById(product.getId());
//		return "not working";
//		
	    
		
		
	}



