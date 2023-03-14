package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSeven {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(19, 2, 3, 2, 99, 409, 5, 4);
		Integer value = list.stream().max((e1, e2) -> e1 > e2 ? 1 : -1).get();
		System.out.println(value);
	}

}
