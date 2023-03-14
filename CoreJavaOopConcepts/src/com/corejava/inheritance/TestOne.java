package com.corejava.inheritance;
import java.util.Scanner;
class Phone{
	public void makeCall() {
		System.out.println("Iam Phone");
	}
	public void getMail() {
		System.out.println("Iam normal phone ,i do not have this feature");
	}
}
class SmartPhone extends Phone{
	public void makeCall() {
		System.out.println("Iam SmartPhone");
	}
}
public class TestOne {

	public static void main(String[] args) {
		SmartPhone smtPhone = new SmartPhone();
		//calling the child class method
		smtPhone.makeCall();
		//Calling the parent class method
		smtPhone.getMail();
		

	}

}
