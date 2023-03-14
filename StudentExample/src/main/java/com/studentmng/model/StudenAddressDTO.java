package com.studentmng.model;

public class StudenAddressDTO {
String name;
String city;
public StudenAddressDTO(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "StudenAddressDTO [name=" + name + ", city=" + city + "]";
}

}
