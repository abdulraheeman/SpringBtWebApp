package com.ar.service;

import com.ar.model.User;

public interface UserService {
  
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
