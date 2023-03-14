package cg.daysix.abstractclasses.demos;

public class Square extends Shape {
	int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	void area() {
		System.out.println("Area of Square is: " + (side * side));
	}
}
