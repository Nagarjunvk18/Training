package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFour {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,2,1,4,5,4);
		List<Integer> duplicatedNumbers = list.stream()
		        .map(number -> number * 2)
		        .collect(Collectors.toList());
		System.out.println(duplicatedNumbers);
	}

}
