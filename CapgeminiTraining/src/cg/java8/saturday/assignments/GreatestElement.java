package cg.java8.saturday.assignments;

import java.util.Scanner;

public class GreatestElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");

		size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// loop to iterate over array
		int large = array[0];
		for (int i = 1; i < array.length; i++) {
			if (large < array[i]) {
				large = array[i];
			}
		}
		System.out.println("Largest element in array: " + large);
		sc.close();
	}

}
