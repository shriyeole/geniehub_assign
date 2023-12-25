package controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Repo.StudentRepository;
import models.students;

@RestController
@RequestMapping("/student")
public class mycontroller {
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/")
	public ResponseEntity<?> addStud(@RequestBody students students)
	{
		models.students save = this.studentRepository.save(students);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStud(@RequestBody students students)
	{
		return ResponseEntity.ok(this.studentRepository.findAll());
	}
}
