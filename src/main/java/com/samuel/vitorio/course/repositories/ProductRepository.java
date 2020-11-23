package com.samuel.vitorio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.vitorio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
