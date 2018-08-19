package com.tim.java.euler;

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		int limit = 1000;
		
		int m1 = 3;
		int m2 = 5;
		
		System.out.println("Limit: "+ limit + " , multiple 1: "+ m1+" , multiple 2: "+ m2);
		System.out.println("Result: "+ run(m1, m2, limit));

	}

	public static int run(int m1, int m2, int limit) {

		int result = 0;

		for (int i = 1; i < limit; i++) {
			if (i % m1 == 0 || i % m2 == 0) {
				System.out.println("Adding number: " + i);
				result = result + i;
				System.out.println("New Total: " + result);
			}
		}

		return result;
	}
}
