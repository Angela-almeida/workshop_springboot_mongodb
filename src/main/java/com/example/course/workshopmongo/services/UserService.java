package com.example.course.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.workshopmongo.domain.User;
import com.example.course.workshopmongo.repository.UserRepository;

@Service //leitura de camada: o serviço acessa o repositorio(private UserRepository user)
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
