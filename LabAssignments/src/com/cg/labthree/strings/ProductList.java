package com.cg.labthree.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> products = new ArrayList<>();
		String product, productToSearch, productToRemove;
		int productIndex;
		char ch = 'y';
		do {
			System.out.println("Enter the choice (y/n)");
			ch = sc.next().charAt(0);
			if (ch == 'n') {
				break;
			}
			System.out.println("Enter the product name");
			product = sc.next();
			products.add(product);

		} while (ch != 'n');
		System.out.println(
				"Enter the option \na.checkname \nb.count the products in the list \nc.remove the given product \nd.remove the product at given index");
		char option;
		option = sc.next().charAt(0);
		switch (option) {
		case 'a':
			System.out.println("Enter the product name to search");
			productToSearch = sc.next();
			if (products.contains(productToSearch))
				System.out.println(productToSearch + " is available in the list");
			break;
		case 'b':
			System.out.println("Number of products in list is: " + products.size());
			break;
		case 'c':
			System.out.println("Enter the product to remove");
			productToRemove = sc.next();
			if (products.remove(productToRemove))
				System.out.println(productToRemove + " is removed");
			System.out.println("List after removing the product");
			for (String element : products) {
				System.out.println(element);
			}
			break;

		case 'd':
			System.out.println("Enter the index to fetch");
			productIndex = sc.nextInt();
			System.out.println(products.remove(productIndex));
			System.out.println("List after removing the product at the given Index");
			for (String element : products) {
				System.out.println(element);
			}
			break;
		}
		sc.close();
	}

}
/*
 * Create a arraylist which stores the product names until user enters yes then
 * performs following operations on it a)checks if the name the entered by user
 * is present or not b)counts the number of product c)removes the product from
 * the list entered by user d)find the product present at index position entered
 * by user
 */