package com.samuel.vitorio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.vitorio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
