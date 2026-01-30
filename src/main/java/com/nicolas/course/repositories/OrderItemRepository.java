package com.nicolas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.course.entities.OrderItem;
import com.nicolas.course.entities.pk.OrderItemPk;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
	

}
