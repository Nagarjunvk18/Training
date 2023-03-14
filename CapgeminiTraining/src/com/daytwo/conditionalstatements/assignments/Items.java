package com.daytwo.conditionalstatements.assignments;

import java.util.ArrayList;
import java.util.Scanner;

class Product{
	
	String name;
	double price;
	int quantity;
	
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getDetails() {
		return this.name+"\n"+this.price+"\n"+this.quantity;
	}
	 
	public boolean checkItem(String iname) {
		if(name.equals(iname)) {
			return true;
		}
		return false;
	}
}


public class Items {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		int quantity;
		ArrayList<Product>list=new ArrayList<>();
		for(int i=0;i<3;i++) {
			System.out.println("enter the details of product "+(i+1));
			name=sc.next();
			price=sc.nextDouble();
			quantity=sc.nextInt();
			list.add(new Product(name, price, quantity));
		}
		String nameToCheck;
		nameToCheck=sc.next();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).checkItem(nameToCheck)) {
				System.out.println("Item Found");
				System.out.println("--------------------------------------------");
				System.out.println(list.get(i).getDetails());
			}else {
				System.out.println("Item Not Found");
			}
		}
	}
}
