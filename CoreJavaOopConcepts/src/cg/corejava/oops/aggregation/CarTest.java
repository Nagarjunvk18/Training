package cg.corejava.oops.aggregation;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, color, type, capacity;
		double price;
		System.out.println("Enter the car details");
		name = sc.next();
		color = sc.next();
		price = sc.nextDouble();
		System.out.println("Enter the Engine details");
		type = sc.next();
		capacity = sc.next();
		Engine engine = new Engine(type, capacity);
		Car car = new Car(name, color, price, engine);
		System.out.println(car);
		sc.close();
	}

}
