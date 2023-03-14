package cg.java8.saturday.assignments;

import java.util.Scanner;

class Product {

	String name;
	double price;
	int quantity;

	void setDetails(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}

	public double calculatePrice(Product product) {
		return product.quantity * product.price;
	}

}

public class ProductDriver {

	public static void main(String[] args) {
		Product[] products = new Product[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < products.length; i++) {
			Product product = new Product();

			String name;
			double price;
			int quantity;

			System.out.println("Enter the name of product " + (i + 1));
			name = sc.next();

			System.out.println("Enter the price of product " + (i + 1));
			price = sc.nextDouble();

			System.out.println("Enter the quanitity of product " + (i + 1));
			quantity = sc.nextInt();

			product.setDetails(name, price, quantity);

			products[i] = product;
		}
		double total = 0.0;
		for (Product prod : products) {
			total = total + prod.price * prod.quantity;
			System.out.println("The Total price of the " + prod.getName() + " is " + prod.calculatePrice(prod));

		}
		System.out.println("Total Price of all products: " + total);
		sc.close();

	}

}
