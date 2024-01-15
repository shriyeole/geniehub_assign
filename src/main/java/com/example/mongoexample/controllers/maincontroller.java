package com.example.mongoexample.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.mongoexample.models.students;


public interface maincontroller 
{
	@PostMapping("/add")
	public ResponseEntity<?> addStud(@RequestBody students students);
	@GetMapping("/get")
	public ResponseEntity<?> getStud();
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletestu(@PathVariable String id);
	@PutMapping("/{id}")
	public ResponseEntity<?> updatestu(@PathVariable String id,@RequestBody students updatestudent);
	@GetMapping("/{id}")
	public ResponseEntity<?> getUser(@PathVariable String id);
}
