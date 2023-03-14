package cg.sai.solutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratearrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int num;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the number " + (i + 1));
			num = sc.nextInt();
			list.add(num);
		}
		System.out.println("Iterating through for each loop");
		// Iterating through for each loop
		for (Integer element : list) {
			System.out.println(element);
		}
		System.out.println("-------------------");
		System.out.println("Iterating through iterator");
		// Iterating through iterator
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int number = iterator.next();
			System.out.println(number);
		}
		sc.close();
	}

}
