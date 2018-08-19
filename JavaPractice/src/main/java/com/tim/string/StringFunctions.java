package com.tim.string;

import java.util.stream.Stream;

public enum StringFunctions {

	END, REVERSE, PALINDROME, RANDOMIZE;
	
	String value;
	
	
	
	public String getValue() {
		return value;
	}

	public static String listFunctions(){
	    String[] list = Stream.of(StringFunctions.values()).map(StringFunctions::name).toArray(String[]::new);
	    
		String functions = "";
		for(int i=1; i<=list.length-1;i++){
			functions = functions + list[i];
			if(i != list.length-1){
				functions = functions + ", ";
			}
		}
		
		return functions;
	}
	
}
