package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		List<Students> list = new ArrayList<>();
		list.add(new Students(10, "webc", 10));
		list.add(new Students(6, "zxc", 30));
		list.add(new Students(3, "sshc", 20));
		list.add(new Students(2, "ikdc", 100));
		// list.sort(Comparator.naturalOrder());
		Collections.sort(list, Comparator.comparingInt(Students::getAge));
	}

}
