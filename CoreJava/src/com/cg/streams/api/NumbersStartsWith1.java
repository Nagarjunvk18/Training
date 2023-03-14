package com.cg.streams.api;

import java.util.Arrays;

public class NumbersStartsWith1 {

	public static void main(String[] args) {
		int[] numbers = { 123, 456, 789, 101, 112, 133, 145, 156, 167, 178 };
		int[] result = findNumbersStartingWith1(numbers);
		System.out.println("Original array: " + Arrays.toString(numbers));
		System.out.println("Numbers starting with 1: " + Arrays.toString(result));
	}

	public static int[] findNumbersStartingWith1(int[] array) {
		int[] array1 = Arrays.stream(array).filter(n -> String.valueOf(n).startsWith("1")).toArray();
		return array1;
	}

}
