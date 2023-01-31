package com.jpa.mypckg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.mypckg.entity.User;
import com.jpa.mypckg.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.saveUsers(users);
	}
	
	@GetMapping("/Users")
	public List<User> findAllUsers(){
		return service.getUsers();
	}
	
	@GetMapping("/UserById/{id}")
	public User findUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@GetMapping("/UserByName/{name}")
	public User findUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@DeleteMapping("/delete/{id}") 
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
}
