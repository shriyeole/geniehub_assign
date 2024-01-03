package com.example.mongoexample.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "stud")
public class students {
	
	private String id;
	private String name;
	private String city;
	private String college;
	private int salary;
	
	public students(String id, String name, String city, String college, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.college = college;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
