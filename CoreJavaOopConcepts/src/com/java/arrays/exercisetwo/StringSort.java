package com.java.arrays.exercisetwo;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size ");
		size = sc.nextInt();
		String[] array = new String[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next();
		}
		String[] strArray = StringSort.sortStrings(array);
		for (String element : strArray) {
			System.out.println(element);
		}
		sc.close();
	}

	public static String[] sortStrings(String[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			int len;
			len = array.length;
			if (len % 2 != 0) {
				if (i < len / 2) {
					array[i] = array[i].toLowerCase();
				} else {
					array[i] = array[i].toUpperCase();
				}
			} else {
				if (i < len / 2) {
					array[i] = array[i].toLowerCase();
				} else {
					array[i] = array[i].toUpperCase();
				}
			}
		}
		return array;
	}

}
