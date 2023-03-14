package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> nameAndAge = new HashMap<>();
		nameAndAge.put("nag", 21);
		nameAndAge.put("kim", 60);
		nameAndAge.put("jim", 27);
		nameAndAge.put("tim", 23);
		for (Map.Entry names : nameAndAge.entrySet()) {
			System.out.println(names.getKey() + " " + names.getValue());
		}
		
		//stream
		nameAndAge.entrySet().stream().sorted(Map.Entry.comparingByKey());
	}

}
