package com.cg.collections.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise7ModifiedToArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> products = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the product " + (i + 1));
			products.add(sc.next());
		}
		Collections.sort(products);
		for (String product : products)
			System.out.println(product);
		sc.close();
	}
}
