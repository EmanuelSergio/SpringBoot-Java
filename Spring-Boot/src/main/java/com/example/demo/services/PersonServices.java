package com.example.demo.services;

import java.util.concurrent.atomic.AtomicLong;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonServices {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public Person findById(String id) {
	
		logger.info("finding one person");
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("emanuel");
		person.setLastName("girardi");
		person.setAddres("forataleza");
		person.setGender("macho");
		return person;
	}
	 
	
	
}
