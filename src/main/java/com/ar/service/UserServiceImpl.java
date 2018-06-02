package com.ar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ar.model.User;
import com.ar.repository.UserRepository;

@Service
public class UserServiceImpl {
      
	@Autowired
	private UserRepository userRepository;
	
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	public void saveUser(User user) {
		userRepository.save(user);
	}
}
