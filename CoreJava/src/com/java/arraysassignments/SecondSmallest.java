package com.java.arraysassignments;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size ;
		size=sc.nextInt();
		int[]array;
		array=new int[size];
		System.out.println();
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println(getsecondSmallest(array));
		
	}
	public static int getsecondSmallest(int[]array) {
		int smallest, secondSmallest ;
		smallest=array[0];
		secondSmallest = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<array[0]) {
				secondSmallest=array[0];
				smallest=array[i];
			}
			else if(smallest==secondSmallest || array[i]<secondSmallest) {
				secondSmallest=array[i];
			}
		}
		return secondSmallest;
	}

}
