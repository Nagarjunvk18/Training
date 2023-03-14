package com.sai.assignments;
import java.util.Scanner;
public class GreatestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOne,numTwo,numThree;
		System.out.println("Enter the 1st number");
		numOne = sc.nextInt();
		System.out.println("Enter the 2nd number");
		numTwo = sc.nextInt();
		System.out.println("Enter the 3rd number");
		numThree = sc.nextInt();
		if(numOne>numTwo && numOne>numThree) {
			System.out.println("numOne is greater ");
		}else if(numTwo>numThree) {
			System.out.println("numTwo is greater ");
		}else {
			System.out.println("numThree is greater");
		}
		sc.close();
	}

}
