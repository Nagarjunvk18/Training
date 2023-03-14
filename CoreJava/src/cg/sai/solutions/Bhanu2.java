package cg.sai.solutions;

import java.util.Scanner;

public class Bhanu2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] workload = new int[n];

		for (int i = 0; i < n; i++) {
			workload[i] = sc.nextInt();
		}

		int rating = employee_rating(n, workload);
		System.out.println(rating);
	}

	static int employee_rating(int n, int[] workload) {

		int max_consecutive_days = 0;
		int current_consecutive_days = 0;
		for (int i = 0; i < n; i++) {
			if (workload[i] > 6) {
				current_consecutive_days++;
			} else {
				current_consecutive_days = 0;
			}

			max_consecutive_days = Math.max(max_consecutive_days, current_consecutive_days);
		}

		return max_consecutive_days;
	}
}
