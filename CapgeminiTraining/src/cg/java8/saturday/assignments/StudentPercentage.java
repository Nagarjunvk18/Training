package cg.java8.saturday.assignments;

import java.util.Scanner;

class Student {
	String name;
	int id;
	int[] marks;

	public Student(String name, int id, int[] marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public double getPercentage() {
		int total = 0;
		double percentage;
		for (int i = 0; i < marks.length; i++) {
			total = total + marks[i];
		}
		percentage = (total / 500.0) * 100;
		return percentage;
	}
}

public class StudentPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int id;
		int[] marks = new int[5];
		System.out.println("Enter the student name");
		name = sc.nextLine();
		System.out.println("Enter the id number of student");
		id = sc.nextInt();
		System.out.println("Enter the student marks for 5 subjects ");
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 0 || marks[i] > 100) {
				System.out.println("Invalid marks");
			} else {
				marks[i] = sc.nextInt();
			}
		}
		Student std = new Student(name, id, marks);
		System.out.println("Student percentage " + std.getPercentage());
		sc.close();
	}
}
