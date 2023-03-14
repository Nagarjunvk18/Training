package com.corejava.assignments;

import java.util.Scanner;

public class WelcomeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address;
		long phoneNumber;
		System.out.println("Enter the Name");
		name = sc.next();
		System.out.println("Enter the phoneNumber");
		phoneNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the address");
		address = sc.nextLine();
		System.out.println(
				"Welcome " + name + " !!  your phoneNumber is " + phoneNumber + " and you are from " + address);
		sc.close();

	}

}
