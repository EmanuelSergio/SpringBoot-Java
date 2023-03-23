package com.example.demo.converters;

public class NumberConverter {

	
	
	public static Double convertToDouble(String strNumber) {
		
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
