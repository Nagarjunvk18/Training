package com.training.dayone;

import java.util.Scanner;

public class Pen {

	String name, color;
	double price;

	public void setDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name followed by color and accountNumber");
		name = sc.nextLine();
		color = sc.nextLine();
		price = sc.nextDouble();
		sc.close();
	}

	public void getDetails() {
		System.out.println("Pen Details[ Name: " + name + ", Color: " + color + ", Price: " + price + " ]");
	}

	public void write() {
		System.out.println("Printing the details ");
	}

	public static void main(String[] args) {
		Pen pen = new Pen();
		pen.setDetails();
		pen.write();
		pen.getDetails();
	}

}
