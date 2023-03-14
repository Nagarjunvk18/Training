package com.cg.collections.assignments;

public class Product {
	private int id, quantity;
	private String name;
	private double price;

	Product(int id, String name, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateTotalPrice() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", quantity=" + quantity + ", name=" + name + ", price=" + price + "]";
	}
}
