package com.cg.collections.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		String[] array = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the product " + (i + 1));
			array[i] = sc.next();
		}
		Arrays.sort(array);
		for (String product : array)
			System.out.println(product);
		sc.close();
	}

}
