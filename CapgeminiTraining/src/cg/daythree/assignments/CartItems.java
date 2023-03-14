package cg.daythree.assignments;

import java.util.Scanner;

public class CartItems {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantity, option;
		char choice;
		do {
			System.out.println("1.laptop 	-----> 30000");
			System.out.println("2.keyboard 	-----> 200.0");
			System.out.println("3.Refrigerator---> 40000");
			System.out.println("4.tv ------------> 10000");
			System.out.println("----------------------");
			System.out.println("Enter your choice(y/n)");
			choice = sc.next().charAt(0);
			if (choice == 'n') {
				System.out.println("Thank You Visit Again");
				break;
			}
			System.out.println("Enter your product option");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Total: " + (30000 * quantity));
				break;
			case 2:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Total: " + (200 * quantity));
				break;
			case 3:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Total: " + (40000 * quantity));
				break;
			case 4:
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				System.out.println("Total: " + (10000 * quantity));
				break;
			}
		} while (choice != 'n');
		sc.close();
	}

}
