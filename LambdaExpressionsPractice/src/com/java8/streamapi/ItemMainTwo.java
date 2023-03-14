package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ItemMainTwo {

	public static void main(String[] args) {
		List<Item> itemsList = new ArrayList<>();
		itemsList.add(new Item(1, "Mobile", 20000, 3));
		itemsList.add(new Item(2, "board", 1000, 7));
		itemsList.add(new Item(3, "cooler", 22000, 4));
		itemsList.add(new Item(4, "TV", 12000, 2));
		itemsList.add(new Item(5, "Laptop", 40000, 2));
		// Here we are getting the price of all items in the sorted order
		List<Double> itemsPrice = itemsList.stream().filter(item -> item.getItemPrice() > 1000)
				.map(item -> item.getItemPrice()).sorted(Collections.reverseOrder()).collect(Collectors.toList());

		Double sum = itemsList.stream().filter(item -> item.getItemPrice() > 1000)
				.map(item -> item.getItemPrice()).reduce((p1, p2) -> p1 + p2).get();
		System.out.println(sum);
		Item optionItem = itemsList.stream().findFirst().get();
		System.out.println(optionItem);
		itemsPrice.stream().forEach(price -> System.out.println(price));
	}

}
