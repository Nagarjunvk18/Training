package cg.bank.assignment;

import java.util.Scanner;

public class MainDriver {

	static void checkBank(Bank obj) {
		if (obj instanceof SBI) {
			System.out.println("SBI ROI is: " + new SBI().getRateOfInterest());
		} else {
			System.out.println("HDFC ROI is: " + new HDFC().getRateOfInterest());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter the bank option 1.SBI , 2.HDFC");
		choice = sc.nextInt();
		Bank bank;
		switch (choice) {
		case 1:
			bank = new SBI();
			bank.setPolicy();
			checkBank(bank);
			break;
		case 2:
			bank = new HDFC();
			bank.setPolicy();
			checkBank(bank);
			break;
		default:
			System.out.println("Select the correct choice");
		}
		sc.close();
	}

}
