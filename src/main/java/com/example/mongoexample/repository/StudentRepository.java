package com.example.mongoexample.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.mongoexample.models.students;


@Repository
public interface StudentRepository extends MongoRepository<students, String> {
}
