package cg.daysix.abstractclasses.demos;

public class Circle extends Shape {
	final static double PI = 3.14;
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("Area of Circle is: " + (PI * radius * radius));
	}

}
