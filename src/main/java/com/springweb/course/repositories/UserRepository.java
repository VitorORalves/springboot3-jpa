package com.springweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
