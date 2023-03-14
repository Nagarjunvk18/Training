package com.cg.collections.comparable;

public class Product implements Comparable<Product>{

	int id;
	int price;
	String name;
	public Product(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
