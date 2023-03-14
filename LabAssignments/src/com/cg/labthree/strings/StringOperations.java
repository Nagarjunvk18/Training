package com.cg.labthree.strings;

import java.util.*;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str = sc.next();
		System.out.println("Enter the choice");
		int choice;
		choice = sc.nextInt();
		System.out.println(performTasks(str, choice));
		sc.close();
	}

	public static String performTasks(String str, int choice) {

		switch (choice) {
		case 1:
			String newString = "";
			newString = str + str;
			return newString;

		case 2:
			char[] arr1 = str.toCharArray();
			for (int i = 0; i < arr1.length; i++) {

				if (i % 2 != 0) {
					arr1[i] = '#';
				}
			}
			return new String(arr1);

		case 3:
			String unique = "";
			HashSet<Character> set = new LinkedHashSet<>();
			char[] array = str.toCharArray();
			for (int i = 0; i < array.length; i++) {
				set.add(array[i]);
			}
			for (Character c : set) {
				unique += c;
			}
			return unique;
		case 4:
			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				char ch = arr[i];
				if (i % 2 != 0) {
					arr[i] = Character.toUpperCase(ch);
				}
			}
			return new String(arr);
		default:
			System.out.println("Enter the correct choice");
		}
		return "";
	}
}
