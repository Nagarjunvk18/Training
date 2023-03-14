package com.cg.labthree.strings;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class LabExercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dateOne, dateTwo;
		LocalDate localDateOne, localDateTwo;
		System.out.println("Enter date one");
		dateOne = sc.next();
		System.out.println("Enter date two");
		dateTwo = sc.next();
		localDateOne = LocalDate.parse(dateOne);
		localDateTwo = LocalDate.parse(dateTwo);
		printDuration(localDateOne, localDateTwo);
		sc.close();
	}

	public static void printDuration(LocalDate dateOne, LocalDate dateTwo) {

		Period period;
		period = Period.between(dateOne, dateTwo);
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		System.out.println("There is a period gap of ");
		System.out.println(years + " Years ," + months + " Months ," + days + " Days ");
	}
}
