package com.example.demo;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

	//private final AtomicLong counter = new AtomicLong();
	
	//query parans = são parametros opcionais, não são obrigados a serem enviados
	//rest parans = são parametros obrigatorios que, se não serem enviados a aplicacao pode quebrar
	
	@GetMapping(value ="/sum/{num1}/{num2}")//esta requerindo valores obrigatorios
	public Double sum(
			@PathVariable(value = "num1") String num1, 
			@PathVariable(value = "num1")String num2
			) throws Exception	{
		
		if(!isNumeric(num1) || !isNumeric(num2)) {
		throw new UnsupportedMathOperationException("COLOCA UM NUMERO AE");
		}
		
		return convertToDouble(num1) + convertToDouble(num2);
		  
	}

	@GetMapping(value = "/sub/{num1}/{num2}")
	public Double subtracao(@PathVariable String num1, @PathVariable String num2) throws Exception {
		if(!isNumeric(num1) || !isNumeric(num2)) throw new UnsupportedMathOperationException("Coloca um numero certo ae");
		
		return convertToDouble(num1) - convertToDouble(num2);
	}
	
	@GetMapping(value = "/mult/{num1}/{num2}")
	public Double multiplicacao(@PathVariable String num1,@PathVariable String num2)throws Exception {
		
		if(!isNumeric(num1) || !isNumeric(num2)) {
			throw new UnsupportedMathOperationException("Coloca um num certo ae");
		}
		
		return convertToDouble(num1) * convertToDouble(num2);
	}
	
	@GetMapping(value = "/div/{num1}/{num2}")
	public Double divisao(@PathVariable String num1,@PathVariable String num2) throws Exception {
		
		if (!isNumeric(num1) || !isNumeric(num2)) {
			throw new UnsupportedMathOperationException("num da div errado");
		}
		
		return convertToDouble(num1) / convertToDouble(num2);
	}
	
	@GetMapping(value = "/media/{num1}/{num2}")
	public Double media(@PathVariable String num1,@PathVariable String num2) throws Exception{
		
		if (!isNumeric(num1) || !isNumeric(num2)) {
			throw new UnsupportedMathOperationException("media errada amigao");
		}
		
		return (convertToDouble(num1) + convertToDouble(num2)) /2;
	}
	
	@GetMapping(value = "raiz/{num1}")
	public Double raiz(@PathVariable String num1) throws Exception{
		
		if (!isNumeric(num1)) {
			throw new UnsupportedMathOperationException("raiz errada meu chapa");
		}
		
		return Math.sqrt(convertToDouble(num1));
	}
	
	private Double convertToDouble(String strNumber) {
		
		if(strNumber == null) 	return 0D;
		
		String number = strNumber.replaceAll(",", ".");//vai pegar o que estiver virgula e substituir pelo ponto
		
		if(isNumeric(number)) return Double.parseDouble(number);
		
		return 1.0D;
	}
	 public static boolean isNumeric(String strNumber) {
	        if (strNumber == null) return false; 
	        String number = strNumber.replaceAll(",", ".");
	        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	    }
	}
	

	
	
	 
