package com.java.strings.daythree;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str = sc.next().toLowerCase();
		int length = str.length(), i, count;
		i = 0;
		count = 0;
		while (i<length) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			i++;
		}
		System.out.println("Vowels Count is: " + count);
		sc.close();
	}

}
