package cg.java.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		try {
			int val = 100 / 0;
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("number cannot be divided by zero");
			e.printStackTrace();
		}

	}

}
