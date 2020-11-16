package com.samuel.vitorio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.vitorio.course.entities.Order;
import com.samuel.vitorio.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepo;
	
	
	public List<Order> getOrders(){
		return orderRepo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = orderRepo.findById(id);
		return user.get();
	}
	
}
