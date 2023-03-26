package com.example.demo.services;

import java.util.List;

import java.util.logging.Logger; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repositories.PersonRepository;

@Service
public class PersonServicesVO {

	private Logger logger = Logger.getLogger(PersonServicesVO.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public List<Person> findAll() {
		logger.info("finding all people");
		return repository.findAll();
	}

	public Person findById(Long id) {
		logger.info("finding one person");
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("nenhuma pessoa encontrada com esse id"));
	}

	public Person create(Person person) {
		logger.info("creating one person");
		return repository.save(person);

	}

	public Person update(Person person) {
		logger.info("updating person");

		var entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("id para update nao encontrado"));
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddres(person.getAddres()); //
		entity.setGender(person.getGender());
		return repository.save(person);

	}

	public void delete(Long id) {
		var entity = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("id para deletar não achado"));
		repository.delete(entity);
	}

}
