package com.tim.array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

	//committed in git maybe?
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n = scan.nextInt();
		System.out.println("Enter number of left rotations:");
		int d = scan.nextInt();

		System.out.println("Enter space separated list of numbers:");
		scan = new Scanner(System.in);
		String a = scan.nextLine();
		int[] arr = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
		leftRotate(arr, d, n);

	}

	public static int[] leftRotate(int[] arr, int d, int n) {

		for (int i = 0; i < d; i++) {
			arr = leftRotateByOne(arr, n);
		}
		System.out.println("\nFinal Result: " + printArray(arr, n));
		return arr;
	}

	public static int[] leftRotateByOne(int[] arr, int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
		return arr;
	}

	public static String printArray(int[] arr, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + arr[i] + " ";
		}
		return result;
	}

}
