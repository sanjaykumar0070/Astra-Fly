package com.service;

import com.model.User;

public interface UserService {

	User register(User user);
	
	User login(String email, String password);
	
}
