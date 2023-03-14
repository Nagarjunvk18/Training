package com.sai.assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str;
		str = sc.next();
		if (validateCreditCard(str)) {
			System.out.println(str + " is valid and is length of " + str.length());
		} else {
			System.out.println(str + " is invalid and is length of " + str.length());
		}
		sc.close();
	}

	public static boolean validateCreditCard(String input) {
		int n = input.length();
		if (n != 13 && n != 16) {
			return false;
		}
		if (n == 13) {
			Pattern pattern = Pattern.compile("[1-9]{13}");
			Matcher matcher = pattern.matcher(input);
			for (int i = 0; i < n; i++) {
				char ch = input.charAt(i);
				if (!(Character.isDigit(ch))) {
					return false;
				} else if (input.charAt(0) == '4' && matcher.matches()) {

					return true;
				}
			}
		} else if (n == 16) {

			String first = input.substring(0, n - 3);
			String last = input.substring(n - 3);
			boolean isExist = Pattern.matches("[1-9]{13}", first);
			Pattern pattern = Pattern.compile("[2-6]{3}");
			Matcher matcher = pattern.matcher(last);
			for (int i = 0; i < n; i++) {
				char ch = input.charAt(i);
				if (!(Character.isDigit(ch))) {
					return false;
				} else if (input.charAt(0) == '4' && matcher.matches() && isExist) {
					return true;
				}
			}
		}
		return false;
	}

}
