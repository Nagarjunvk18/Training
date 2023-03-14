package com.java.strings.daythree;

import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] products = new String[5];
		String search;
		for (int i = 0; i < products.length; i++) {
			System.out.println("enter the product " + (i + 1));
			products[i] = sc.nextLine();
		}
		System.out.println("Enter the product to search");
		search = sc.nextLine();
		boolean found;
		found = false;
		String item = null;
		for (String element : products) {
			if (element.equalsIgnoreCase(search)) {
				found = true;
				item = element;
			}
		}
		if (found) {
			System.out.println(item + " is found");
		} else {
			System.out.println(search + " is not found");
		}
		sc.close();
	}

}
