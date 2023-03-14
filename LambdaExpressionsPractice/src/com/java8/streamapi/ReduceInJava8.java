package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceInJava8 {

	public static void main(String[] args) {

		List<Integer> numsList = Arrays.asList(9, 7, 8, 11, 25);
		Integer optionalList = numsList.stream().filter(num -> num > 10)
				.reduce((num1, num2) -> num1 > num2 ? num1 : num2).get();
//		optionalList.stream().forEach(num -> System.out.println(num));
		System.out.println(optionalList);

	}

}
