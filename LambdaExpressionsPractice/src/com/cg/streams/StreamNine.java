package com.cg.streams;

import java.util.OptionalInt;

public class StreamNine {

	public static void main(String[] args) {
		String str = "hey how are you doing?";
		// Given String str = "hey,how are you doing?" find the first non-repeated
		// character using streams
		OptionalInt first = str.chars().filter(ch -> str.chars().filter(c -> c == ch).count() == 1).findFirst();
		System.out.println((char)first.getAsInt());
	}

}
