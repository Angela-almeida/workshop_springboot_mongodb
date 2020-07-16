package com.example.course.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.course.workshopmongo.domain.User;

//Vamos implementar o UserRepository usando o SpringData, que por sua vez de encontra incluida no MondoDB
@Repository
public interface UserRepository extends MongoRepository <User, String> {
	

}
