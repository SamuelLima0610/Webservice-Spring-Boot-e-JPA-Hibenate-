package com.samuel.vitorio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.vitorio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
