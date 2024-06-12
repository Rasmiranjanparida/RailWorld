package abstract2;

public class test {
	public static void main(String[] args) {
		new son().carrier();
		new son().subject();

	}

}

abstract class parent

{
	abstract void carrier();

	abstract void subject();
}

class son extends parent {

	@Override
	void carrier() {
		// TODO Auto-generated method stub
		System.out.println("carrier");

	}

	@Override
	void subject() {
		// TODO Auto-generated method stub
		System.out.println("subject");

	}

}
