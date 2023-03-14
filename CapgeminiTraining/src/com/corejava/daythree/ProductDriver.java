package com.corejava.daythree;
import java.util.Scanner;

class Product{
	private String name;
	private double price;
	private int quantity;
	public void setDetails(String name,double price,int quantity) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name");
		this.name=sc.next();
		System.out.println("Enter the product price");
		this.price=sc.nextDouble();
		System.out.println("Enter the product quantity");
		this.quantity=sc.nextInt();
	}
	public String getDetails(boolean check) {
		if(check) {
			return "name: "+this.name+" price: "+this.price+" quantity: "+this.quantity;
		}
		return "Cannot display";
		
	}
	public boolean checkProduct(String productName) {
		if(this.name.equals(productName)) {
			return true;
		}
		return false;
	}
}
public class ProductDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		Product[]products = new Product[3];
		for(int i=0;i<products.length;i++) {
			Product product = new Product();
			System.out.println("Enter the "+(i+1)+" product");
			product.setDetails(null, 0, 0);
			products[i]=product;
		}
		System.out.println("Enter the name to check");
		name=sc.next();
		boolean found=false;
		//
		for(Product product:products) {
			if(product.checkProduct(name)) {
				found=true;
				System.out.println("Product Found");
				System.out.println(product.getDetails(found));
			}else {
				System.out.println("Product Not Found");
			}
			
		}
	}

}
