package com.user.user_service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.Entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list = List.of(
			new User(101, "Shrijeet", "9421"),
			new User(102, "Aman", "942158"),
			new User(103, "Rushi", "42168")
		);
	
	@Override
	public User getUser(int id) {
		return this.list.stream().filter(user -> user.getUserId() == id).findAny().orElse(null);
	}
	
}
