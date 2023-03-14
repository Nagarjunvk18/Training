package com.java.collections;

import java.util.Comparator;

public class Students implements Comparator<Students> {
	int id, age;
	String name;

	Students(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.getAge();
	}

	@Override
	public int compare(Students o1, Students o2) {
//		return o1.age - o2.age;
		return 0;
	}
}
