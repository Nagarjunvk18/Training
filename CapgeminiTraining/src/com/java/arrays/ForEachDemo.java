package com.java.arrays;

import java.util.*;

public class ForEachDemo {

	public static void main(String[] args) {
		Scanner sc;
		int[] nums;
		int size;
		sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}

		// for each loop to iterate
		for (int element : nums)
			System.out.print(element + " ");
		sc.close();
	}

}
