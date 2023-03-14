package cg.daythree.assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = sc.nextInt();
		if (number == 0 || number == 1) {
			System.out.println(1);
		}
		int fact = 1;
		while (number > 1) {
			fact = fact * number;
			number--;
		}
		System.out.println(fact);
		sc.close();
	}
public static int findFactorial(int num) {
	if(num==0||num==1)
		return 1;
	else
		return num*findFactorial(num-1);
}
}
/*		1.	2.	3.
 * 5!=5*(5-1)*(4-1)*(3-1);
 */
