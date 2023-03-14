package cg.daysix.abstractclasses.demos;
import java.util.Scanner;
public class ShapeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape;
		shape=new Square(12);
		shape.area();
		//Object of Circle
		shape=new Circle(12);
		shape.area();
		//Object of Rectangle
		shape=new Rectangle(2,3);
		shape.area();
		sc.close();
	}
}
