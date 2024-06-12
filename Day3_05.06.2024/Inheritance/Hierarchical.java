package Inheritance;

public class Hierarchical {

	public static void main(String[] args) {
		new A().m1();
		new b().m1();
		new c().m1();
		new c().m1(10);

	}

}

class A {
	void m1() {
		System.out.println(" hi i am class A");
	}

}

class b extends A {
	void m1() {
		System.out.println(" hi i am class B");
	}
}

class c extends A {
	void m1() {
		System.out.println(" hi i am class c");
	}

	void m1(int a) {
		super.m1();
		System.out.println(" hi i am class c");
	}

}
