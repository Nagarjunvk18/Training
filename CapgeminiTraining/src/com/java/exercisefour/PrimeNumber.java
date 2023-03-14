package com.java.exercisefour;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit;
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		for (int i = 0; i < limit; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
		sc.close();

	}

	// method to find the number is prime or not
	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
