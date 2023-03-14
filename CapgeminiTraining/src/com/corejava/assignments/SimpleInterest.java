package com.corejava.assignments;

import java.util.Scanner;

/*
 * SimpleInterest program
 */
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double principalAmount, simpleInterest;
		int years;
		float rateOfInterest;
		System.out.println("Enter the principal amount");
		principalAmount = sc.nextDouble();
		System.out.println("Enter the number of years");
		years = sc.nextInt();
		System.out.println("Enter the rate of interest");
		rateOfInterest = sc.nextFloat();

		simpleInterest = (principalAmount * years * rateOfInterest) / 100;
		System.out.println("Simple Interest = " + simpleInterest);
		System.out.println("Total amount with Interest = " + (principalAmount + simpleInterest));
		sc.close();
	}

}
