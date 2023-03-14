package cg.constructors.superkey;

public class Employee extends Person {
	int empId;
	double salary;

	public Employee(String name, int age, int empId, double salary) {
		super(name, age);
		this.empId = empId;
		this.salary = salary;
	}

	void showDetails() {
		super.showDetails();
		System.out.println("EmpId " + empId + " Salary " + salary);
	}
}
