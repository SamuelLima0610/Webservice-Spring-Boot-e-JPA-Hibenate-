package com.samuel.vitorio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.vitorio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
