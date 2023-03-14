package com.cg.streams.api;
import java.util.*;

public class MaxFind {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		System.out.println("Maximum number in the array: " + findMax(numbers));

	}

	public static int findMax(int[] numbers) {
		if (numbers.length == 0 || numbers == null)
			throw new IllegalArgumentException("Array must not be null or empty");
		int number = Arrays.stream(numbers).max()
				.orElseThrow(() -> new RuntimeException("Could not find maximum value"));
		return number;
	}

}
