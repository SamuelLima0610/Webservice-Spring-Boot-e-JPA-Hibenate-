package com.samuel.vitorio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.vitorio.course.entities.Category;
import com.samuel.vitorio.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> getCategorys(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> user = repository.findById(id);
		return user.get();
	}
	
}
