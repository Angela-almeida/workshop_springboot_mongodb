package com.example.course.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.workshopmongo.domain.User;
import com.example.course.workshopmongo.dto.UserDTO;
import com.example.course.workshopmongo.services.UserService;

@RestController //leitura de camada : o controlador Rest acessa o serviço
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity <List<UserDTO>>  findAll(){
		//nova lista de usuarios
		List<User> list = service.findAll(); //vai ao banco de dados buscar os usuarios e guarda os na lista list
		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList()); // para cada objeto x(neste caso usuario, vou retornar new UserDTO com x como argumento //conversão de cada objeto da lista para DTO
		return ResponseEntity.ok().body(listDto);
	}

}
