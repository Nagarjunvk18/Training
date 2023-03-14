package com.java.collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee{
	private int id;
	private String name;
	private double salary;
	private LocalDate date;
	
	public Employee(int id, String name, double salary, LocalDate localDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = localDate;
	}
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
	public LocalDate getJoiningDate() {
		return date;
	}
	public void setJoiningDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}
	
	
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)));
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)));
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)));
        employees.add(new Employee(1009, "Steve", 100000.00, LocalDate.of(2016, 5, 18)));

        System.out.println("Employees : " + employees);

        // Sort employees by Name
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Name) : " + employees);

        // Sort employees by Salary
        Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nEmployees (Sorted by Salary) : " + employees);

        // Sort employees by JoiningDate
        Collections.sort(employees, Comparator.comparing(Employee::getJoiningDate));
        System.out.println("\nEmployees (Sorted by JoiningDate) : " + employees);

        // Sort employees by Name in descending order
        Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());
        System.out.println("\nEmployees (Sorted by Name in descending order) : " + employees);

        // Chaining multiple Comparators
        // Sort by Salary. If Salary is same then sort by Name
        Collections.sort(employees, Comparator.comparing(Employee::getName).thenComparingDouble(Employee::getSalary));
        System.out.println("\nEmployees (Sorted by Salary and Name) : " + employees);
    }
}