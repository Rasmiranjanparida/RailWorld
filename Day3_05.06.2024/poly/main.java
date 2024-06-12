package poly;

public class main {
	public static void main(String[] args) {
		bike bike= new splender();
		bike.run();
	}

}

class bike {
	void run() {
		System.out.println("bike running");
	}
}

class splender extends bike {
	void run()
	{
		System.out.println("splender running");
	}

}
