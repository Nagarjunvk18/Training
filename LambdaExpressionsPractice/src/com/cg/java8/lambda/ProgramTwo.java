package com.cg.java8.lambda;
interface FunctionalTwo{
	int show(int a,int b);
}
public class ProgramTwo {

	public static void main(String[] args) {
		FunctionalTwo two=(a,b)->{return a+b;};
		System.out.println(two.show(10, 10));
	}

}
