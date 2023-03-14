package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class StreamThree {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100, 12, 17, 29, 15);
		list.stream().filter(num -> String.valueOf(num).startsWith("1")).forEach(System.out::println);

	}

}
