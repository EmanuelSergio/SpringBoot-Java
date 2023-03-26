package com.example.demo.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.demo.data.vo.v2.PersonVOV2;
import com.example.demo.model.Person;

@Service
public class PersonMapper {

	public PersonVOV2 convertEntityToVo(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());		
		vo.setAddres(person.getAddres());
		vo.setGender(person.getGender());
		vo.setBirthDay(new Date());
		
		return vo;
	}

	public Person convertVoToEntity(PersonVOV2 person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());		
		entity.setAddres(person.getAddres());
		entity.setGender(person.getGender());
		
		return entity;
	}
	
	
	
}
