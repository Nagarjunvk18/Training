package com.daytwo.conditionalstatements.assignments;

import java.util.Scanner;

//Bank Class
class Bank {
	 
	private double amount = 10000;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

//Withdraw Method
	public void withdraw(double money) {

		
		System.out.println(amount - money);
	}

//Deposit method
	public double deposit(double money) {
		
		return amount + money;
	}

//BalanceCheck method
	public double checkBalance() {
		
		return amount;

	}
}

public class AssignmentTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		Bank bank = new Bank();
		double amount;
		switch (choice) {
		case 1:
			System.out.println("Enter the amount to withdraw");
			amount = sc.nextDouble();
			System.out.print("you have withdrawn: "+amount+" your balance is: ");
			bank.withdraw(amount);
			break;
		case 2:
			System.out.println("Enter the amount to deposit");
			amount = sc.nextDouble();
			System.out.println("you have deposited: "+amount+" your balance is: "+bank.deposit(amount));			
			break;
		case 3:
			System.out.println("your account balance is: "+bank.checkBalance());
			break;
		}
		System.out.println("Happy Banking");
		sc.close();

	}

}
