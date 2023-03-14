package com.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaHashmap {
	public static void main(String[] args) {
		Map<String, String> countryISOCodeMapping = new HashMap<>();

		countryISOCodeMapping.put("India", "IN");
		countryISOCodeMapping.put("United States of America", "US");
		countryISOCodeMapping.put("Russia", "RU");
		countryISOCodeMapping.put("Japan", "JP");
		countryISOCodeMapping.put("China", "CN");

		// HashMap's entry set
		Set<Entry<String, String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
		System.out.println("countryISOCode entries : " + countryISOCodeEntries);
		//countryISOCodeEntries.stream().sorted(Map.Entry.comparingByValue()).collect(toMap(Map.Entry::getKey,Map.Entry::getValue, (v1,v2)->v2,LinkedHashMap::new));
		// HashMap's key set
		Set<String> countries = countryISOCodeMapping.keySet();
		System.out.println("countries : " + countries);

		// HashMap's values
		Collection<String> isoCodes = countryISOCodeMapping.values();
		System.out.println("isoCodes : " + isoCodes);
	}

}
