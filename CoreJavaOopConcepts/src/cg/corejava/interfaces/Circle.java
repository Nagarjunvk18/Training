package cg.corejava.interfaces;

public class Circle implements Drawable {
	final static double PI = 3.14;
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle is: " + (PI * radius * radius));
	}

	@Override
	public void animate() {
		System.out.println("animating a circle");
	}

}
