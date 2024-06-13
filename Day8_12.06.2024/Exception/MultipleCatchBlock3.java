package Exception;

public class MultipleCatchBlock3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
	        System.out.println(a[10]);
			
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
		finally {
			System.out.println("finally execution");
		}

	}

}
