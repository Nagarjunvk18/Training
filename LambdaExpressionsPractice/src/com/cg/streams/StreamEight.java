package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamEight {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(19, 2, 3, 1, 1, 4, 5, 4);
		Optional<Integer> secondSmallest = list.stream().sorted().distinct().skip(1).findFirst();
		System.out.println(secondSmallest);

	}

}
