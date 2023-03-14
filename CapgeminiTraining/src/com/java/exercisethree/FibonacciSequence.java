package com.java.exercisethree;

import java.util.Scanner;

public class FibonacciSequence {
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the nth fibonacci_number to be displayed");
		number = sc.nextInt();
		System.out.println("Normal Approach");
		getFibonacci(number);
		System.out.println("Recursive Approach");
		System.out.println(getFibonacciNumber(number));
		printFibo(number);
		sc.close();
	}

	// Normal method to find nth-Fibonacci
	public static void getFibonacci(int n) {
		int a = 0, b = 1, c;
		if (n == 0 || n == 1)
			System.out.println(a);
		else {
			for (int i = 2; i < n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(b);
		}

	}

	static void printFibo(int count) {
		if (count >= 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n1);
			printFibo(count - 1);
		}

	}
	// Recursive approach

	public static int getFibonacciNumber(int n) {
		int a = 0, b = 1;
		if (n == 0 || n == 1)
			return a;
		else if (n == 2) {
			return b;
		} else {
			return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
		}
	}
}
