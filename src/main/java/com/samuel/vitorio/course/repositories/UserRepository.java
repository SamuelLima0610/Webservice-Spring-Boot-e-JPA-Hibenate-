package com.samuel.vitorio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.vitorio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
