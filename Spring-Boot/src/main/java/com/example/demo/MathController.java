package com.example.demo;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	//private final AtomicLong counter = new AtomicLong();
	
	//query parans = são parametros opcionais, não são obrigados a serem enviados
	//rest parans = são parametros obrigatorios que, se não serem enviados a aplicacao pode quebrar
	
	@GetMapping(value ="/sum/{num1}/{num2}")//esta requerindo valores obrigatorios
	public Double sum(@PathVariable(value = "num1") Double num1, @PathVariable(value = "num1")Double num2) {
		return num1 + num2;
		 
	}
	
	
	 
}
