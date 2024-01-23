package com.user.user_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.user_service.Entity.User;
import com.user.user_service.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") int userId) {
		User user = this.userService.getUser(userId);
		
		List Contact = this.restTemplate.getForObject("http://localhost:9012/contact/user/"+user.getUserId(), List.class);
		
		user.setContacts(Contact);
		return user;
		
	}
}
