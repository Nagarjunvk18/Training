package cg.corejava.interfaces;

public class Rectangle implements Drawable {
	int length, breadth;

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is: " + (length * breadth));
	}

	@Override
	public void animate() {
		System.out.println("animating rectangle");
	}

}
