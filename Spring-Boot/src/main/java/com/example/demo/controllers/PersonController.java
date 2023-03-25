package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired // esta instanciando pelo Spring boot
	private PersonServices service;
	//private PersonServices service = new PersonServices();
	
	//query parans = são parametros opcionais, não são obrigados a serem enviados
	//rest parans = são parametros obrigatorios que, se não serem enviados a aplicacao pode quebrar
	
	
	@GetMapping(value ="/{id}")//esta requerindo valores obrigatorios
	public Person findById(@PathVariable(value = "id") String id) throws Exception 	{
		return service.findById(id);
		  
	}  

	@PostMapping()//esta requerindo valores obrigatorios
	public Person create(@RequestBody Person person) throws Exception 	{
		return service.create(person);
		  
	}  
	
	@GetMapping()//esta requerindo valores obrigatorios
	public List<Person> findAll()  	{
		return service.findAll();
		  
	}  
	
	
	
	
	
	}
	

	
	
	 
