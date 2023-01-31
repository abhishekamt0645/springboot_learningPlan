package com.jpa.mypckg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.mypckg.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByName(String name);
}
