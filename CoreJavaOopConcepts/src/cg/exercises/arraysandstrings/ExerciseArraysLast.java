package cg.exercises.arraysandstrings;

import java.util.Arrays;
import java.util.Scanner;

//ExerciseThree
public class ExerciseArraysLast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int[] arrayLatest = ExerciseArraysLast.getSorted(array);
		for (Integer element : arrayLatest) {
			System.out.println(element);
		}
		sc.close();
	}

	public static int numReverse(int n) {
		int rev = 0, digit;
		while (n != 0) {
			digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		return rev;
	}

	public static int[] getSorted(int[] array) {
		int[] revArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			revArray[i] = numReverse(array[i]);
		}
		Arrays.sort(revArray);
		return revArray;
	}
}
