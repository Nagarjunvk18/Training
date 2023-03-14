package com.cg.labthree.strings;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DateExercise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		LocalDate localdate;
		System.out.println("Enter date one");
		str = sc.next();
		localdate = LocalDate.parse(str);
		printDuration(localdate);
		sc.close();
	}

	public static void printDuration(LocalDate date) {
		LocalDate today;
		today = LocalDate.now();
		Period period;
		period = Period.between(date, today);
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		System.out.println("There is a period gap of ");
		System.out.println(years + " Years ," + months + " Months ," + days + " Days ");
	}
}
