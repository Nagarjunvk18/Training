package com.cg.streams.api;

import java.util.Arrays;

public class MultiplyBy10 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] result = multiplyBy10(numbers);
		System.out.println("Original array: " + Arrays.toString(numbers));
		System.out.println("Modified array: " + Arrays.toString(result));
	}

	public static int[] multiplyBy10(int[] numbers) {
		return Arrays.stream(numbers).map(n -> n > 7 ? n * 10 : n).toArray();
	}
}
