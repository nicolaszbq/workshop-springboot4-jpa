package com.nicolas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.course.entities.Product;
	

public interface ProductRepository extends JpaRepository<Product, Long> {

}