package com.java.arraysassignments;

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(2,4.5);
		m1(1.1,2);
	//	m1(5,7);// Ambiguity
	}
	public static void m1(int a,double b) {
		System.out.println(a+" "+b);
	}
	
	public static void m1(double a,int b) {
		System.out.println(a+" "+b);
	}

}
