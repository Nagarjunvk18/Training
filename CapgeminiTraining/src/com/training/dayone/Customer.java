package com.training.dayone;

import java.util.Scanner;

public class Customer {

	String name;
	int age;
	long accountNumber;

	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name followed by age and accountNumber");
		name = sc.nextLine();
		age = sc.nextInt();
		accountNumber = sc.nextLong();
		sc.close();
	}

	public void getDetails() {
		System.out.println(
				"Customer Details[ Name: " + name + ", Age: " + age + ", AccountNumber: " + accountNumber + " ]");
	}

	public void write() {
		System.out.println("Printing the details ");
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setDetails();
		customer.write();
		customer.getDetails();
	}

}
