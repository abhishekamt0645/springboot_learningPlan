package com.jpa.mypckg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.mypckg.entity.User;
import com.jpa.mypckg.repository.UserRepository;

@Service
public class UserService {
	
	//Post Methods
	@Autowired
	private UserRepository repository;
	
	public User saveUser (User user) {
		return repository.save(user);
	}
	
	public List<User> saveUsers (List<User> userList) {
		return repository.saveAll(userList);
	}
	
	//Get Methods
	public List<User> getUsers() {
		return repository.findAll();
	}
	
	public User getUserById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public User getUserByName(String name) {
		return repository.findByName(name);
	} 
	
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User Deleted!!!!";
	}
	
	public User updateUser(User user) {
		User existingUser = repository.findById(user.getId()).orElse(null);
		existingUser.setName(user.getName());
		existingUser.setCity(user.getCity());
		return repository.save(existingUser);
	}
}
