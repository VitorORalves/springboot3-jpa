package com.springweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.course.entities.User;
import com.springweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repo.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repo.save(obj);
	}
}
