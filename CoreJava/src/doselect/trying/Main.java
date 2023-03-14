package doselect.trying;

import java.util.ArrayList;

class Customer {
	int id;
	String name;

	double balance;

	Customer(int id, String name, double balance) {
		this.id = id;
		this.name = name;

		this.balance = balance;
	}
}

class Item {
	int id;
	String name;
	double price;
	boolean inStock;

	Item(int id, String name, double price, boolean inStock) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.inStock = inStock;
	}

	public static void purchaseItem(Item item, Customer customer) throws StockBalanceException {
		if (!item.inStock) {
			throw new StockBalanceException("Item is out of stock");
		}

		else if (item.price > customer.balance) {
			throw new StockBalanceException("Insufficient balance");
		} else {

			System.out.println("Order Successful");
		}
	}
}

class StockBalanceException extends Exception {
	StockBalanceException(String message) {
		super(message);
	}
}

public class Main {

	public static void main(String[] args) {
		Customer cus = new Customer(927392, "Steve", 5000.09);
		Item item = new Item(27392, "T-Shirt", 8090, true);
		try {
			item.purchaseItem(item, cus);
		} catch (StockBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
