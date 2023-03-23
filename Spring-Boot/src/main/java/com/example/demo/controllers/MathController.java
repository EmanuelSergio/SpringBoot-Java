package com.example.demo.controllers;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converters.NumberConverter;
import com.example.demo.exceptions.UnsupportedMathOperationException;
import com.example.math.SimpleMath;

@RestController
public class MathController {

	//private final AtomicLong counter = new AtomicLong();
	
	//query parans = são parametros opcionais, não são obrigados a serem enviados
	//rest parans = são parametros obrigatorios que, se não serem enviados a aplicacao pode quebrar
	
	private SimpleMath math = new SimpleMath();
	
	@GetMapping(value ="/sum/{num1}/{num2}")//esta requerindo valores obrigatorios
	public Double sum(
			@PathVariable(value = "num1") String num1, 
			@PathVariable(value = "num1")String num2
			) throws Exception	{
		
				if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
		throw new UnsupportedMathOperationException("COLOCA UM NUMERO AE");
		}
		
		return math.sum(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2)) ;
		  
	}  

	@GetMapping(value = "/sub/{num1}/{num2}")
	public Double subtracao(@PathVariable String num1, @PathVariable String num2) throws Exception {
		if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) throw new UnsupportedMathOperationException("Coloca um numero certo ae");
		
		return math.subtracao(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2)) ;	}
	
	@GetMapping(value = "/mult/{num1}/{num2}")
	public Double multiplicacao(@PathVariable String num1,@PathVariable String num2)throws Exception {
		
		if(!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("Coloca um num certo ae");
		}
		
		return math.multiplicacao(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2)) ;
	}
	
	@GetMapping(value = "/div/{num1}/{num2}")
	public Double divisao(@PathVariable String num1,@PathVariable String num2) throws Exception {
		
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("num da div errado");
		}
		
		return math.divisao(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2)) ;
	}
	
	@GetMapping(value = "/media/{num1}/{num2}")
	public Double media(@PathVariable String num1,@PathVariable String num2) throws Exception{
		
		if (!NumberConverter.isNumeric(num1) || !NumberConverter.isNumeric(num2)) {
			throw new UnsupportedMathOperationException("media errada amigao");
		}
		
		return math.media(NumberConverter.convertToDouble(num1), NumberConverter.convertToDouble(num2)) ;
	}
	
	@GetMapping(value = "raiz/{num1}")
	public Double raiz(@PathVariable String num1) throws Exception{
		
		if (!NumberConverter.isNumeric(num1)) {
			throw new UnsupportedMathOperationException("raiz errada meu chapa");
		}
		
		return math.raiz(NumberConverter.convertToDouble(num1)) ;
	}
	
	
	}
	

	
	
	 
