package com.cg.streams;

import java.util.Arrays;
import java.util.List;

public class StreamSix {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(19, 2, 3, 2, 1, 4, 5, 4);
		long count=list.stream().count();
		System.out.println(count);
	}

}
