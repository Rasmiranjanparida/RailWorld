package Exception;

import java.io.IOException;

class parent {
	void msg() throws IOException
	{
		System.out.println("hi i am parent method");
	}
}

public class overriddenMethod extends parent {

	@Override
	void msg() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hi i am child method");
		
	}
	public static void main(String[] args) throws IOException {
		parent p= new overriddenMethod();
		p.msg();
	} 
	
	
	

}
