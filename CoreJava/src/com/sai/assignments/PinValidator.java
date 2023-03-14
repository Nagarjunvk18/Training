package com.sai.assignments;

//import com.java.collections.Students;

public class PinValidator {

	public static void main(String[] args) {
		int pin;
		pin = 123;
		String strPin = "" + pin;
		int length = strPin.length();
		
		try {
			checkLength(strPin);
		} catch (InvalidPinException ipe) {
			System.out.println(ipe.getMessage());
		} finally {
			System.out.println("Last of program");
		}
	}

	static void checkLength(String str) throws InvalidPinException {
		if (str.length() != 4) {
			throw new InvalidPinException("Your pin must be length of 4");
		} else {
			System.out.println("Valid Pin");
		}
	}

}
