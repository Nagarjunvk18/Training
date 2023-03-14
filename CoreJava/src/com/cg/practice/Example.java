package com.cg.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class customer {
	String name;
	String mobilenum;
	String custmerId;

	public customer(String name, String mobilenum, String custmerId) {
		super();
		this.name = name;
		this.mobilenum = mobilenum;
		this.custmerId = custmerId;
	}
}

class Validator {
	public String validateCustomerID(customer c) throws Exception {
		String result = "";
		String num = c.mobilenum;
		String fourDigit = num.substring(0, 4);
		String name = c.name;
		String newname = name.substring(name.length() - 2);
		result = fourDigit.concat(newname);
		if (!(result.matches(c.custmerId))) {
			throw new InvalidCustomerIDException("Invalid customerID");
		} else
			return "valid Cid";
	}

	public String validateMobileNo(customer c) throws Exception {
		String mobnum = c.mobilenum;
		long num = Long.parseLong(c.mobilenum);
		if (!(c.mobilenum.matches("[6-9][0-9]{9}"))) {
			throw new InvalidMobileNoException("Invalid MObile number");
		} else
			return "Valid Mobile number";
	}

	class InvalidCustomerIDException extends Exception {
		public InvalidCustomerIDException(String str) {
			super(str);
		}
	}

	class InvalidMobileNoException extends Exception {
		public InvalidMobileNoException(String str) {
			super(str);
		}
	}

	class CustomerCareException {
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			customer obj = new customer("Steve", "9898111111", "9898ve");
			Validator val = new Validator();
			String CID = val.validateCustomerID(obj);
			String mob = val.validateMobileNo(obj);
			System.out.println(mob);
			System.out.println(CID);
		}
	}
}

public class Example {

}