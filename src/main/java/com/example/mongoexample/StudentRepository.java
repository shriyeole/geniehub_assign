package com.example.mongoexample;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.students;

public interface StudentRepository extends MongoRepository<students, String> {
	
}
