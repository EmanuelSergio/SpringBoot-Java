package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	
	
	public List<Person> findAll() {
		
		logger.info("finding all people");
		List<Person> persons = new ArrayList<>();
	
		for (int i = 0; i < 8; i++) {
			logger.info("finding all people");
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		
		return persons;
	}
	
	
		
	
	public Person findById(String id) {
	
		logger.info("finding one person");
		Person person = new Person();
		person.setId(counter.incrementAndGet()); //está gerando id aleatorio
		person.setFirstName("emanuel");
		person.setLastName("girardi");// elementos pré setado apenas para teste
		person.setAddres("forataleza");
		person.setGender("macho");
		return person;
	}
	 
	private Person mockPerson(int i) {
		logger.info("finding one person");
		Person person = new Person();
		person.setId(counter.incrementAndGet()); //está gerando id aleatorio
		person.setFirstName("Person name "+i);
		person.setLastName("last name " +i);// elementos pré setado apenas para teste
		person.setAddres("some addres in Brazil");
		person.setGender("macho");
		return person;
		
		
	}
	
	public Person create(Person person) {
		logger.info("finding one person");
		
		return person;
		
		
	}
	
	public Person update(Person person) {
		logger.info("finding one person");
		
		return person;
		
		
	}
}
