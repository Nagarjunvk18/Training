package cg.java8.saturday.assignments;

import java.util.Scanner;

public class NamesArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		String nameToSearch;
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		String[] array = new String[size];
		System.out.println("Enter the names to an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
		System.out.println("Enter the name to search");
		nameToSearch = sc.next();

		System.out.println(nameToSearch + " is found at index " + linearSearch(array, nameToSearch));
		sc.close();
	}

	public static int linearSearch(String[] array, String name) {
		for (int i = 0; i < array.length; i++) {
			if (name.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

}
