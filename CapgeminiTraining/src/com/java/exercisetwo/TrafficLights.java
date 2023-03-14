package com.java.exercisetwo;

import java.util.Scanner;

public class TrafficLights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String button;
		System.out.println("Enter the buttonOne");
		button = sc.next().toLowerCase();
// 		Here we are converting everything of the String into the lowercase.
		sc.close();
		switch (button) {
		case "red":
			System.out.println("Please Stop!!");
			break;
		case "yellow":
			System.out.println("Please get Ready!!");
			break;
		case "green":
			System.out.println("Please Go!!");
			break;
		default:
			System.out.println("Improper choice");
		}
	}

}
