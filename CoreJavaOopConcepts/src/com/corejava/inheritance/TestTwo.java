package com.corejava.inheritance;
//Multi Level Inheritance
class A{
	void m1() {
		System.out.println("m1() of A");
	}
}
class B extends A{
	void m2() {
		System.out.println("m2() of B");
	}
}
class C extends B{
	void m3() {
		System.out.println("m3() of C");
	}
}
public class TestTwo {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();c.m3();

	}

}
