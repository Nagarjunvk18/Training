package com.cg.streams.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Candidate {
	private String name;
	private int id;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;

	public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Candidate> list = new ArrayList<>();
		list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));

		Map<String, Long> count = Implementation.getCount(list);
		Map<String, Double> averageAge = Implementation.getAverageAge(list);
		Map<String, Long> departmentCount = Implementation.countCandidatesDepartmentWise(list);
		Optional<Candidate> youngestCandidate = Implementation.getYoungestCandidateDetails(list);

		System.out.println(count);
		System.out.println(averageAge);
		System.out.println(departmentCount);
		System.out.println(youngestCandidate);

	}
}

class Implementation {
	public static Map<String, Long> getCount(List<Candidate> list) {
		return list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
	}

	public static Map<String, Double> getAverageAge(List<Candidate> list) {
		return list.stream()
				.collect(Collectors.groupingBy(Candidate::getGender, Collectors.averagingInt(Candidate::getAge)));
	}

	public static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
		return list.stream().collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
	}

	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list) {
		return list.stream().filter(candidate -> candidate.getDepartment().equals("Product Development")
				&& candidate.getGender().equals("Male")).min(Comparator.comparingInt(Candidate::getAge));
	}
}
