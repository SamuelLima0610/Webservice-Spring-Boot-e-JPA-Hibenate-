package com.samuel.vitorio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.vitorio.course.entities.Product;
import com.samuel.vitorio.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> user = repository.findById(id);
		return user.get();
	}
	
}
