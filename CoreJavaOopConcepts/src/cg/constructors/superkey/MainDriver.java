package cg.constructors.superkey;

import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age, empId;
		double salary;
		System.out.println("enter the name");
		name = sc.next();
		System.out.println("enter the age");
		age = sc.nextInt();
		System.out.println("enter the emp id");
		empId = sc.nextInt();
		System.out.println("enter the salary");
		salary = sc.nextDouble();
		Employee emp = new Employee(name, age, empId, salary);
		emp.showDetails();
		sc.close();
	}
}
