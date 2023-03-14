package com.daytwo.conditionalstatements.assignments;

import java.util.Scanner;

public class Item {
	String name;
	float price;
	int quantity;

	void setDetails(String name, float price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	void getDetails() {
		System.out.println("Name: " + name + "\n" + "Price: " + price + "\n" + "Quantity: " + quantity);
	}

	boolean checkItem(String name) {
		return this.name.equalsIgnoreCase(name);
	}

	public static void main(String[] args) {
		Item[] items = new Item[3];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < items.length; i++) {
			Item item = new Item();

			String name;
			float price;
			int quantity;

			System.out.println("Enter the name of item no. " + (i + 1));
			name = scanner.next();

			System.out.println("Enter the price of item no. " + (i + 1));
			price = scanner.nextFloat();

			System.out.println("Enter the quanitity of item no. " + (i + 1));
			quantity = scanner.nextInt();

			item.setDetails(name, price, quantity);

			items[i] = item;
		}
		String searchName;
		searchName = scanner.next();
		boolean found = false;
		Item searchedItem = null;
		for (Item item : items) {
			if (item.checkItem(searchName)) {
				found = true;
				searchedItem = item;
				break;
			}
		}
		if (found) {
			System.out.println("Item found !!! \n-------------------");
			searchedItem.getDetails();
		} else {
			System.out.println("Item not found");
		}

		System.out.println("");

		scanner.close();
	}
}
