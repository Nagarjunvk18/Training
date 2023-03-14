package cg.sai.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//33 question
public class ConvertListToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int num;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the number " + (i + 1));
			num = sc.nextInt();
			list.add(num);
		}
		// Filling elements of list with array
		int[] array = new int[list.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = list.get(i);
		}
		System.out.println("Iterating array through for each loop");
		// Iterating through for each loop
		for (Integer element : array) {
			System.out.println(element);
		}
		// By using the StreamApi java 8
		Integer[] arr = list.stream().toArray(Integer[]::new);

		System.out.println("Iterating array through for each loop after doing with stream Api");
		// Iterating through for each loop
		for (Integer element : arr) {
			System.out.println(element);
		}
		sc.close();
	}

}
