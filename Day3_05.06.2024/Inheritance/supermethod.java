package Inheritance;

public class supermethod {
	public static void main(String[] args) {
		new z();
	}

}

class x {
	public x() {
        System.out.println(" hi i am x");
	}

	
}

class y extends x {
	public y() {
		 System.out.println(" hi i am y");

	}
}

class z extends y {
	public z() {
		 System.out.println(" hi i am z");

	}
}
