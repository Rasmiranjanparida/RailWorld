package abstraction;

abstract class shape {
	abstract void draw();

}

class rectangle extends shape {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw rectangle");
	}
}
class circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw circle");
		
	}
	
}

public class abstraction1 {
	public static void main(String[] args) {
		 new rectangle().draw();
		 new circle().draw();
	
	}
	

}
