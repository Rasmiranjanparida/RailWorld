package abstraction;

public class A {
	public static void main(String[] args) {
		new c().m1();
	}

}
abstract class b{
	abstract void m1();
	
}
class c extends b{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}
	
}

