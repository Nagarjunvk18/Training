package com.java.exerciseone;

import java.util.Scanner;

public class SumOfTheCubesOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = sc.nextInt();
		sumOfCubes(number);
		sc.close();
	}

	public static void sumOfCubes(int num) {
		int sum = 0,digit;
		int temp = num;
		while (num != 0) {
			digit = num % 10;
			int cube = digit*digit*digit;
			sum += cube;
			num = num / 10;
		}
		System.out.println("sum of cubes of each digit of " + temp + " is " + sum);
	}

}
