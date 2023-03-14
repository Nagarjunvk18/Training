package com.corejava.assignments;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int celcius;
		double fahrenheit;
		System.out.println("Enter the temperature in degrees ");
		celcius = sc.nextInt();
		fahrenheit = (9.0 / 5.0) * celcius + 32;
		System.out.println("Fahrenheit value of " + celcius + "C is " + fahrenheit + "F");
		sc.close();
	}

}
