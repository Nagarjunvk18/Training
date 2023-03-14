package com.cg.practice;

import java.util.*;
import java.util.Comparator;
class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}
class Company {
	ArrayList<Employee> empList = new ArrayList<>();
	public ArrayList<String> highPayList() {
		Collections.sort(empList, new Sorting());
		ArrayList<String> names = new ArrayList<>();
		for (Employee employee : empList) {
			names.add(employee.name);
		}
		return names;
	}
}
class Sorting implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.salary - o1.salary;
	}
}
class Source {
	public static void main(String[] args) {
		ArrayList<Employee>empList=new ArrayList<>();
		Employee data2 = new Employee("CEO", 20000);
		Employee data3 = new Employee("intern", 30000);
		Employee data1 = new Employee("developer", 40000);
		Company obj=new Company();
		obj.empList.add(data2); 
		obj.empList.add(data3);
		obj.empList.add(data1);
		obj.highPayList().stream().forEach(System.out::println);;
	}
}
