package com.tim.math;

public class BasicOperations {
	
	
	public static void main(String[] args){
		double a = 10;
		double b = 2.5;
		
		System.out.println("Addition Result: " + add(a,b));
		System.out.println("Subtraction Result: " + subtract(a,b));
		System.out.println("Multiplication Result: " + multiply(a,b));
		System.out.println("Division Result: " + divide(a,b));

	}
	

	public static double add(double a, double b) {
		return a + b;
	}

	public static double subtract(double a, double b) {
		return a - b;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static double divide(double a, double b) {
		return a / b;
	}

	
	
}
