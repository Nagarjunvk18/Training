package cg.corejava.interfaces;

import java.util.Scanner;

public class DrawableTest {

	public static void getDetails(Drawable draw) {
		if (draw instanceof Circle) {
			double radius;
			radius = 12;
			draw = new Circle(radius);
			System.out.println("Circle Shape");
			draw.animate();
			draw.area();
		} else if (draw instanceof Rectangle) {
			int length, breadth;
			length = 10;
			breadth = 20;
			draw = new Rectangle(length, breadth);
			System.out.println("Rectangle Shape");
			draw.animate();
			draw.area();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("select the shape to draw");
		String shape;
		shape = sc.next();
		if (shape.equalsIgnoreCase("circle")) {

			getDetails(new Circle(12));
		} else {
			getDetails(new Rectangle(10, 20));
		}
		sc.close();
	}
}
