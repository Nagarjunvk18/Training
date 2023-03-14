package cg.corejava.oops.aggregation;

public class Car {
	String name, color;
	double price;
	Engine engine;

	public Car(String name, String color, double price, Engine engine) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", engine=" + engine + "]";
	}

}
