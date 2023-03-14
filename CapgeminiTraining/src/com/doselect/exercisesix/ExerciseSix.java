package com.doselect.exercisesix;

import java.util.Scanner;

public class ExerciseSix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the range of natural numbers");
		number = sc.nextInt();
		System.out.println("The diffence between the sum of squares and sum of numbers upto " + number + " is: "
				+ calculateDifference(number));
		sc.close();
	}

	public static int calculateDifference(int number) {
		int sum = 0, squareSum = 0;
		while (number != 0) {
			sum = sum + number;
			squareSum = squareSum + (number * number);
			number--;
		}
		return squareSum - (sum * sum);
	}

}
/*
 * Create a class with a method to find the difference between the sum of the
 * squares and the square of the sum of the first n natural numbers.
 *
 * (1^2+2^2.....+n^2)-(1+2+3+...+n)^2;
 */