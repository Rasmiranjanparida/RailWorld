package abstraction;

abstract class moter{
	abstract void run();
}

public class bike extends moter {

	@Override
	void run() {
		System.out.println("bike is running");
		
	}

	public static void main(String[] args) {
		bike bike= new bike();
		bike .run();
		
	}
}
