package com.example.mongoexample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoexample.models.User;
import com.example.mongoexample.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/register")
	public ResponseEntity<?> regisUser(@RequestBody User user){
		userRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("User Added Successfully");
	}
	
	@GetMapping("/getuser")
	public ResponseEntity<?> getUser(){
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user){
		User existingUser = userRepository.findByUsername(user.getUsername());
		
		if(existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
			return ResponseEntity.ok("Login Successful");
		}
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Username or Password");
	}
}
