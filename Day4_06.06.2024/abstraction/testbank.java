package abstraction;

public class testbank {
	public static void main(String[] args) {
	 System.out.println(new PNB().interest())  ;
	 System.out.println( new SBI().interest()); 
		
	}

}
abstract class Bank{
	abstract int interest();
}
class SBI extends Bank{

	@Override
	int interest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}
class PNB extends Bank{

	@Override
	int interest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

