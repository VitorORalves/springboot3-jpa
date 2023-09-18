package com.springweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
