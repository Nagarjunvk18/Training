package com.sai.assignments;

import java.util.HashSet;
import java.util.Set;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueConsonants("nagarjunanrkj");
	}

	public static void uniqueConsonants(String input) {
		int n = input.length();
		char ch;
		int total = 0;
		String good = "";
		for (int i = 0; i < n; i++) {
			ch = input.charAt(i);

			if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u')) {
				good = good + ch;
			}
		}
		System.out.println(good);
		char[] array = good.toCharArray();
		String unique = "";
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					break;
				}
				if (count == 1) {
					unique += array[j];
					break;
				}
			}
		}
		System.out.println(unique);

	}

}
