package com.daytwo.conditionalstatements.assignments;

import java.util.Scanner;

public class AssignmentOne {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		String password,userName,designation;
		System.out.println("Enter User Name");
		userName = sc.nextLine();
		System.out.println("Enter Password");
		password = sc.next();
		
		float experience;
		if (userName.equals("admin") && password.equals("admin@123")) {
			System.out.println("Login Success !!!");

			System.out.println("Enter Experience in number of years");
			experience = sc.nextFloat();
			System.out.println("Enter Designation");
			designation = sc.next();
			if (experience >= 10 && designation.equals("manager")) {
				System.out.println("You are eligible for yearly incentives");
			} else {
				System.out.println("Not Eligible");
			}
		} else {
			System.out.println("Login Failed !!!, Check the User Name and Password");
		}
		sc.close();
	}

}
