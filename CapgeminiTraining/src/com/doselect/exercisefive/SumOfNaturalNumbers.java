package com.doselect.exercisefive;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("enter the number");
		number = sc.nextInt();
		calculateSum(number);
		sc.close();
	}

//  Normal Method Of approach
	public static void calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}

		}
		System.out.println(sum);
	}

}
