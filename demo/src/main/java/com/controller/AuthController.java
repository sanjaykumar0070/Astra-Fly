package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping("api/auth")
public class AuthController {
	
	@Autowired
	private UserService userService;
	
	//REGISTER
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		
//		user.setRole("USER");
		return userService.register(user);
	}
	
	//LOGIN
	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		
		User user = userService.login(email, password);
		
		if(user != null) {
			return "Login Successful";
		}
		
		return "Invalid Email or Password";
	}
	
	@GetMapping("/getData")
	public String getData() {
		return "API WORKING";
	}
}
