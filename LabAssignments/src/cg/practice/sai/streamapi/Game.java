package cg.practice.sai.streamapi;

import java.util.stream.Stream;

class A{
	void print() {
		System.out.println("A");
	}
}
class B extends A{
	void print() {
		System.out.println("B");
	}
}
public class Game {
	public static void printing(A a) {
		a.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][]myarray3=new int[][2];
		StringBuilder sb=new StringBuilder("java");
		String s1=sb.toString();
		String s2=s1;
		//System.out.println(s1==s2);
		A a=new A();
		A a1=new B();
		B b1 = new B();
		printing(a);
		printing(a1);
		printing(b1);
		String[]msg= {"welcome"," to ","java"};
	}
}
