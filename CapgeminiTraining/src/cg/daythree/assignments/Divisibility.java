package cg.daythree.assignments;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low, high, count = 0, temp;
		System.out.println("enter the lower limit");
		low = sc.nextInt();
		System.out.println("enter the upper limit");
		high = sc.nextInt();
		temp = low;
		while (low <= high) {
			if (low % 5 == 0)
				count++;
			low++;
		}
		System.out.println(count + " numbers are divisible by 5 from " + temp + " to " + high);
		sc.close();
	}

}
