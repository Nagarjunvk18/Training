package cg.bank.assignment;

import java.util.Scanner;

public class BankDriver {

	static void checkBank(Bank obj) {
		if(obj instanceof SBI) {
			System.out.println("SBI ROI is: "+new SBI().getRateOfInterest());
		}else {
			System.out.println("HDFC ROI is: "+new HDFC().getRateOfInterest());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the bank option 1.SBI , 2.HDFC");
		choice = sc.nextInt();
		SBI sbi;
		HDFC hdfc;
		Bank bank;
		char option;
		double amount;
		int years;
		
		
		switch (choice) {
		case 1:
			sbi = new SBI();
			System.out.println("Select the options a.show rate of interest, b.calculate rate of interest");
			System.out.println("select the choices of SBI bank");

			option = sc.next().charAt(0);
			if (option == 'a') {
				
//				System.out.println("rate of interest of sbi is: " + sbi.getRateOfInterest() + "%");
			} else {

				System.out.println("Enter the principal amount");
				amount = sc.nextDouble();
				System.out.println("enter the years");
				years = sc.nextInt();
				System.out.println("Simple Interest calculated by SBI bank is: " + sbi.simpleInterest(amount, years));
			}
			break;
		case 2:
			hdfc = new HDFC();
			System.out.println("Select the options a.show rate of interest, b.calculate rate of interest");
			System.out.println("select the choices of HDFC bank");
			option = sc.next().charAt(0);
			if (option == 'a') {
				System.out.println("rate of interest of hdfc is: " + hdfc.getRateOfInterest() + "%");
			} else {
				System.out.println("Enter the principal amount");
				amount = sc.nextDouble();
				System.out.println("enter the years");
				years = sc.nextInt();
				System.out.println("Simple Interest calculated by HDFC bank is: " + hdfc.simpleInterest(amount, years));
			}
			break;
		default:
			System.out.println("Enter the correct choice");
		}
		System.out.println("Thank you visit again");
	sc.close();
	}
		
	
}
/*
 * [5:50 PM] Monika Mane Create a class with Bank as base class and SBI,HDFC as
 * child classes create method getRateofintrest() in child classes for SBI it is
 * 5% and for HDFC it is 8%   Bank(parent) ---SBI --getRateofIntrest()--5
 * ---HDFC--getRateofIntrest()--8  
 * 
 * main(){   Bank 1)SBI 2)HDFC select option 1 a.show rate of intrest
 * b.calculate simpleintrest a. rate is 5% b. Enter the principal amount 10000
 * Enter the no.of years 4 Simple Intrest=4000
 * 
 */