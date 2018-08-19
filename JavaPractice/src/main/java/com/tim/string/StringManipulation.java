package com.tim.string;

import java.util.Scanner;

public class StringManipulation {

	public static void reverse(Scanner in) {
		System.out.println("-----Begin Reverse Process-----");
		System.out.println("Enter input now: ");
		String input = in.next();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println("Reversed String: " + output);
		System.out.println("-----Reverse Process Completed-----");
	}

	public static void palindrome(Scanner in) {
		System.out.println("-----Begin Palindrome Process-----");
		System.out.println("Enter input now: ");
		String input = in.next();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		if (input.equals(output)) {
			System.out.println("Input is a palindrome.");
		}
		else{
			System.out.println("Input is not a palindrome.");
		}
		System.out.println("-----Palindrome Process Completed-----");

	}

}
