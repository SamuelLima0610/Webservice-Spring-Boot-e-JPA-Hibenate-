package com.samuel.vitorio.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.vitorio.course.entities.Category;
import com.samuel.vitorio.course.services.CategoryService;

@RestController
@RequestMapping(value= "/categories")
public class CategoryResource {

	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		//Category user = new Category(2L, "neves@gov.br", "neves","Aecio Neves", "99892-1232");
		return ResponseEntity.ok().body(service.getCategorys());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(service.findById(id));
	}
}
