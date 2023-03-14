package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ItemMain {

	public static void main(String[] args) {
		List<Item> itemsList = new ArrayList<>();
		itemsList.add(new Item(1, "Mobile", 20000, 3));
		itemsList.add(new Item(2, "board", 1000, 7));
		itemsList.add(new Item(3, "cooler", 22000, 4));
		itemsList.add(new Item(4, "TV", 12000, 2));
		itemsList.add(new Item(5, "Laptop", 40000, 2));

		//sorting the items by using lambda expression
		Collections.sort(itemsList, (i1, i2) -> i1.getItemPrice() > i2.getItemPrice() ? 1 : -1);
		//printing the itemsList by using java 8 streams
		itemsList.stream().forEach(System.out::println);
		
		long count = itemsList.stream().filter(item->item.getItemName().startsWith("c")).count();
		System.out.println(count);
	}

}
