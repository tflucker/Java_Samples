package com.tim.main;

import java.util.Scanner;

import com.tim.string.StringFunctions;
import com.tim.string.StringManipulation;

public class StringUtil {

	public static void main(String[] args) {

		System.out.println("Welcome to the String Utility!");
		boolean running = true;
		while (running) {
			System.out.println("Available Functions: " + StringFunctions.listFunctions());
			System.out.println("Please enter END to exit.");
			Scanner in = new Scanner(System.in);
			String function = in.next();
			switch (StringFunctions.valueOf(function.toUpperCase())) {
			case REVERSE:
				StringManipulation.reverse(in);
				break;
			case PALINDROME:
				StringManipulation.palindrome(in);
				break;
			case END:
				System.out.println("-----Terminated-----");
				running = false;
				in.close();
				break;
			default:
				System.out.println("Invalid Input, Please try again.");
				break;
			}
		}

	}
}
