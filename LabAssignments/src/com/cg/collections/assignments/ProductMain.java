package com.cg.collections.assignments;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, quantity;
		double price;
		String name;
		List<Product> products = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the details of product " + (i + 1));
			System.out.println("Enter the id,name,price,quantity of product " + (i + 1));
			id = sc.nextInt();
			name = sc.next();
			price = sc.nextDouble();
			quantity = sc.nextInt();
			products.add(new Product(id, name, price, quantity));
		}
		// Calculating total price of all products
		double totalPrice = 0;
		for (Product product : products) {
			totalPrice += product.calculateTotalPrice();
		}
		System.out.println("Total price of all products: " + totalPrice);
		// highest price product
		Product highestPriceProduct = products.get(0);
		for (int i = 1; i < products.size(); i++) {
			if (products.get(i).getPrice() > highestPriceProduct.getPrice()) {
				highestPriceProduct = products.get(i);
			}
		}
		System.out.println("Highest price Product: " + highestPriceProduct);
		sc.close();
	}

}
/*
*/