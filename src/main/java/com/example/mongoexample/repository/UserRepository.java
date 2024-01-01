package com.example.mongoexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongoexample.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
