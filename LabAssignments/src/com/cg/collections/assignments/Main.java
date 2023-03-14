package com.cg.collections.assignments;

import java.util.stream.IntStream;

public class Main {
	public static String stringOperation(String s, int choice) {
		if (choice == 1) {
			// Add the String to itself
			return s + s;
		} else if (choice == 2) {
			// Replace odd positions with #
			return IntStream.range(0, s.length()).mapToObj(i -> i % 2 == 1 ? "#" : String.valueOf(s.charAt(i)))
					.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		} else if (choice == 3) {
			// Remove duplicate characters in the String
			return s.chars().distinct().mapToObj(c -> String.valueOf((char) c))
					.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		} else if (choice == 4) {
			// Change odd characters to upper case
			return IntStream.range(0, s.length())
					.mapToObj(i -> i % 2 == 1 ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i)))
					.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		} else {
			return "Invalid choice";
		}
	}

	public static void main(String[] args) {
		System.out.println(stringOperation("hello", 1)); // returns "hellohello"
		System.out.println(stringOperation("hello", 2)); // returns "h#l#o"
		System.out.println(stringOperation("hello", 3)); // returns "helo"
		System.out.println(stringOperation("hello", 4)); // returns "hElLo"
		System.out.println(stringOperation("hello", 5)); // returns "Invalid choice"
	}
}
