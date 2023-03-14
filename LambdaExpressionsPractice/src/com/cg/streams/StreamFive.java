package com.cg.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class NoElementException extends Exception {
	public NoElementException(String message) {
		super(message);
	}
}

public class StreamFive {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(19, 2, 3, 2, 1, 4, 5, 4);
		Optional<Integer> optionalInt = list.stream().findFirst();
		try {
			if (optionalInt.isPresent()) {
				System.out.println("Element is present" + optionalInt.get());
			} else {
				throw new NoElementException("The list is empty");
			}
		} catch (NoElementException ne) {
			System.out.println(ne.getMessage());
		} finally {
			System.out.println("Executed");
		}
		System.out.println(list.stream().findFirst().orElse(-1));

	}
}
