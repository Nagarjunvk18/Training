package cg.corejava.inheritance;

public class HierarchialInheritance {

	public static void main(String[] args) {
		Two two = new Two();
		// can access methods of One and Two classes
		two.m1();
		two.m2();

		Three three = new Three();
		// can access methods of One and Two classes
		three.m1();
		three.m3();

	}

}
