package com.doselect.exerciseseven;

import java.util.Scanner;

public class ExerciseSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = sc.nextInt();
		if (checkNumber(number)) {
			System.out.println("Increasing Number");
		} else {
			System.out.println("Not an increasing Number");
		}
		sc.close();
	}

	public static boolean checkNumber(int n) {
		int first,digit=0;
		String status = "No";
		first = n % 10;
		while (n != 0) {
			digit = n % 10;
			if (first > digit) {
				status = "Ok";
			}
			first = digit;
			n = n / 10;
		}
		if (status.equals("Ok")) {
			return true;
		} else {
			return false;
		}
	}

}

//Create a method to check if a number is an increasing number
/*
 * Method Name checkNumber Method Description Check if a number is an increasing
 * number Argument int number Return Type boolean Logic A number is said to be
 * an increasing number if no digit is exceeded by the digit to its left. For
 * Example : 134468 is an increasing number
 * 
 */