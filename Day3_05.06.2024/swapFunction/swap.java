package swapFunction;

public class swap {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+","+b);
		System.out.println(m1(a,b));
	}

	public static String m1(int a, int b) {
		int temp=a;
		a=b;
	    b=temp;
	    return a +","+ b;
		
	}
	

}
