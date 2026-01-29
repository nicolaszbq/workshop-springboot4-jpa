package com.nicolas.course.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.course.entities.Order;
import com.nicolas.course.entities.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
