package com.cg.classesandobjects;

public class Person {
	String firstName, lastName;
	char gender;
	long phoneNumber;

	public Person() {

	}

	public Person(String firstName, String lastName, char gender, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person Details \n" + "----------------- \n" + "First Name: " + firstName + "\n" + "Last Name: "
				+ lastName + "\n" + "Gender: " + gender + "\n" + "Phone Number: " + phoneNumber;
	}

}
