package Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import models.students;

public interface StudentRepository extends MongoRepository<students, Integer> {

}
