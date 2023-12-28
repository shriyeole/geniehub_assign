package com.example.mongoexample;

import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.students;

@RestController
public class mycontroller {
	private static final String id = null;
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/add")
	public ResponseEntity<?> addStud(@RequestBody students students)
	{
		studentRepository.save(students);
        return ResponseEntity.status(HttpStatus.CREATED).body("Student added successfully");
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getStud()
	{
		return ResponseEntity.ok(this.studentRepository.findAll());
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deletestu(@PathVariable String id)
	{
		studentRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK).body("student with id "+ id +" deleted successfully");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatestu(@PathVariable String id,@RequestBody students updatestudent){
		Optional<students> optionalStudent = studentRepository.findById(id);
		
		if(optionalStudent != null) 
		{
			students currStudent = optionalStudent.get();
			
			currStudent.setName(updatestudent.getName());
			currStudent.setCity(updatestudent.getCity());
			currStudent.setCollege(updatestudent.getCollege());
			currStudent.setSalary(updatestudent.getSalary());
			
			studentRepository.save(currStudent);
			return ResponseEntity.status(HttpStatus.OK).body("Student updated successfully");
		}
		else 
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
		}
	}
}
