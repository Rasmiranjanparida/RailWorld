package interfaces;

public class multiInterface {
	public static void main(String[] args) {
		new test().print();
		
	}

}
interface printable{
	abstract void print();
	
}
interface show{
	abstract void print();
	
}
class test implements printable,show{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}
	
}
