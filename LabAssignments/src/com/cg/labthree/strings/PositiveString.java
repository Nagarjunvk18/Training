package com.cg.labthree.strings;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.next();
		if (isPositiveString(str))
			System.out.println(str + " is a positive string");
		else
			System.out.println(str + " is not a positive string");
		sc.close();
	}

	public static boolean isPositiveString(String str) {
		char[] array = str.toCharArray();
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			// here iam comparing the sorted char array with the given string by checking
			// the character positions
			if (str.charAt(i) != array[i])
				return false;
		}
		return true;
	}

}
