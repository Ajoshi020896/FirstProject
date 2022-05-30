package com.practice.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);
	Product findById(int id);

}
