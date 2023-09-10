package com.springweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.course.entities.Order;
import com.springweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;

	public List<Order> findAll() {
		return repo.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = repo.findById(id);
		return user.get();
	}
}