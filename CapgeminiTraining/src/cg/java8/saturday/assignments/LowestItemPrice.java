package cg.java8.saturday.assignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Item Class
class Item {
	String name;
	LocalDate dateOfManufacture;
	double price;

	public void setDetails(String name, LocalDate dateOfManufacture, double price) {
		this.name = name;
		this.dateOfManufacture = dateOfManufacture;
		this.price = price;
	}

	public String getDetailsOfItem() {
		return "Item [name=" + this.name + ", dateOfManufacture=" + this.dateOfManufacture + ", price=" + this.price
				+ "]";
	}

//method to return the Item with lowestPrice
	public static Item lowestPricedItem(Item[] items) {
		double lowest;
		lowest = items[0].price;
		Item leastPrice = null;
		for (int i = 1; i < items.length; i++) {
			if (items[i].price < lowest) {
				lowest = items[i].price;
				leastPrice = items[i];
			}

		}
		return leastPrice;
	}

}

public class LowestItemPrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfItems;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		System.out.println("Enter the number of items: ");
		numberOfItems = sc.nextInt();
		Item[] items = new Item[numberOfItems];
		for (int i = 0; i < items.length; i++) {
			Item item = new Item();
			String name;
			String date;
			double price;
			LocalDate localDate;
			System.out.println("Enter the name of item " + (i + 1));
			name = sc.next();
			System.out.println("Enter the date of item " + (i + 1));
			date = sc.next();
			// localDate = LocalDate.parse(date, formatter);
			System.out.println("Enter the price of item " + (i + 1));
			price = sc.nextDouble();
			localDate = LocalDate.parse(date, formatter);
			item.setDetails(name, localDate, price);

			items[i] = item;
		}
		System.out.println("Item with the lowest price is displayed below: ");
		System.out.println(Item.lowestPricedItem(items).getDetailsOfItem());
		sc.close();
	}
}
