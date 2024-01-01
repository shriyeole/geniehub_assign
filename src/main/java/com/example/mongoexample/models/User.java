package com.example.mongoexample.models;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Document(collection = "userdetails")
public class User {
//	public String getUid() {
//		return uid;
//	}
//	public void setUid(String uid) {
//		this.uid = uid;
//	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	private String uid;
	@NotBlank
	private String username;
	@NotBlank
	private String password;
}
