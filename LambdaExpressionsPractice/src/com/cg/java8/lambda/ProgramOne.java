package com.cg.java8.lambda;

import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
interface FunctionalOne{
	void show();
}
public class ProgramOne {

	public static void main(String[] args) {
		/*
		List<String>names=new ArrayList<>();
		names.add("nagarjuna");
		names.add("kiran");
		names.add("nirup");
		names.add("kurup");
		*/
		FunctionalOne one = ()->System.out.println("This is  lambda expression no argument demo");
		one.show();
	}

}
