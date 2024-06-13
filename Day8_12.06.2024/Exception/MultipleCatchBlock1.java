package Exception;

public class MultipleCatchBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException occur");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("parent excwption occur");
		}

	}

}
