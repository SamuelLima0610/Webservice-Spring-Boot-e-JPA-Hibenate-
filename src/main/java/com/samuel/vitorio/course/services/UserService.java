package com.samuel.vitorio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.vitorio.course.entities.User;
import com.samuel.vitorio.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	
	public List<User> getUsers(){
		return userRepo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepo.findById(id);
		return user.get();
	}
	
}
