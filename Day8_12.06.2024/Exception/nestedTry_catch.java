package Exception;

public class nestedTry_catch {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("dividing by zero");
				int b=39/0;
				
				
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.err.println("ArithmeticException");
			}
			try {
				int a[]= new int[5];
				a[5]=4;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.err.println("ArrayIndexOutOfBoundsException occur");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("handel the exception (outer catch)");
		}
		System.out.println("normal flow");
	}

}
