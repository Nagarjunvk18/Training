package com.cg.eis.bean;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;

	// Constructor to initialize employee details
	public Employee(int id, String name, double salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	// Getter and setter methods for the attributes of the Employee class
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
}

/*
 * By default, all employees in an organization will be assigned with a medical
 * insurance scheme based on the salary range and designation of the employee.
 * Refer the below given table to find the eligible insurance scheme specific to
 * an employee. Salary Designation Insurance scheme >5000 and < 20000 System
 * Associate Scheme C >=20000 and <40000 Programmer Scheme B >=40000 Manager
 * Scheme A <5000 Clerk No Scheme
 */