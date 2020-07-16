package com.example.course.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.workshopmongo.domain.User;
import com.example.course.workshopmongo.services.UserService;

@RestController //leitura de camada : o controlador Rest acessa o serviço
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<User>>  findAll(){
		//nova lista de usuarios
		List<User> list = service.findAll(); //vai ao banco de dados buscar os usuarios e guarda os na lista list
		return ResponseEntity.ok().body(list);
	}

}
