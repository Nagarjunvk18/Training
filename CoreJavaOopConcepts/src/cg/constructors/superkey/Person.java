package cg.constructors.superkey;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void showDetails() {
		System.out.println("Name " + name + " Age " + age);

	}
}
