package com.java.training.basics;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address;
		int age;
		System.out.println("Enter the Name");
		name = sc.next();
		System.out.println("Enter the age");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address");
		address = sc.nextLine();
		System.out.println(name + " has " + age + " and he is from " + address);
		sc.close();
	}

}
