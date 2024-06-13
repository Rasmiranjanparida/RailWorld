package Exception;

import java.io.IOException;

public class Testthrows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthrows1 obj= new Testthrows1();
		obj.p();
		System.out.println("normal flow");

	}

	public void p() {
		// TODO Auto-generated method stub
		try {
		 n();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception handled");
		}
		
		
		
	}

	public void n()throws IOException {
		// TODO Auto-generated method stub
		m();
	
	}

	public void m()throws IOException {
		// TODO Auto-generated method stub
		throw new IOException("device error");
		
	}

}
