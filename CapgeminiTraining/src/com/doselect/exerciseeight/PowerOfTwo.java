package com.doselect.exerciseeight;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = sc.nextInt();

		System.out.println(checkNumber(number));
	}

	public static boolean checkNumber(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		while (number != 1) {
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}
}
