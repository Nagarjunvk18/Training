package cg.daysix.abstractclasses.demos;

public class Rectangle extends Shape {
	int length, breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void area() {
		System.out.println("Area of Rectangle is: " + (length * breadth));
	}

}
