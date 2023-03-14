package com.java.training.basics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum;
		System.out.println("Enter the First Number");
		num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("Total sum = " + sum);
		sc.close();
	}

}
