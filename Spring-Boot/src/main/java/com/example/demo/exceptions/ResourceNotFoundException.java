package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND) //retorna um codigo de erro
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	 public ResourceNotFoundException(String ex) {
		// TODO Auto-generated constructor stub
		 super(ex);
	}
	
}
