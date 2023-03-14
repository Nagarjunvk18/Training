package cg.corejava.oops.aggregation;

public class Engine {
	String type;
	String capacity;

	public Engine(String type, String capacity) {
		super();
		this.type = type;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", capacity=" + capacity + "]";
	}

}
