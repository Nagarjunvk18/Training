package com.sai.assignments;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number;
		number = sc.nextInt();
		if (number > 0) {
			System.out.println("Positive");
		} else if (number < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Neither Negative or Positive");
		}
		sc.close();
	}

}
