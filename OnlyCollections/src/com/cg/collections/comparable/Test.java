package com.cg.collections.comparable;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");
	}

}

public class Test {
	public static void main(String[] args) {
		IntStream.range(1, 10).filter(i -> {
			System.out.print("1");
			return i % 2 == 0;
		}).filter(i -> {
			System.out.print("0");
			return i > 3;
		}).limit(1).forEach(i -> {
			System.out.print(i);
		});
	}
}
