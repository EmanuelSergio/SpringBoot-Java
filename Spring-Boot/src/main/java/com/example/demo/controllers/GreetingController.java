package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	//query parans = são parametros opcionais, não são obrigados a serem enviados
	//rest parans = são parametros obrigatorios que, se não serem enviados a aplicacao pode quebrar
	
	@GetMapping("/greeting")//usada para pegar dados da url
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	
	 
}
