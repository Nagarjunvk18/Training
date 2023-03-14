package cg.sai.solutions;

import java.util.Scanner;

public class Bhanu1 {
	public static void main(String[] args) {
		// Read input from the user
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] keyboard = new String[N];
		for (int i = 0; i < N; i++) {
			keyboard[i] = scanner.next();
		}
		String word = scanner.next();

		// Validate the word
		int result = solved(N, keyboard, word);
		System.out.println(result);
	}

	public static int solved(int N, String[] keyboard, String word) {
		for (char c : word.toCharArray()) {
			boolean valid = false;
			for (String row : keyboard) {
				if (row.indexOf(c) != -1) {
					valid = true;
					break;
				}
			}
			if (!valid) {
				return 0;
			}
		}
		return 1;
	}
}
