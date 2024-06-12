package Inheritance;

public class classA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "hi";
		String b= "hi";
		String c= new String("hi");
		String d= new String("hi").intern();
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.hashCode());
		 a="hello";
		 System.out.println(b.hashCode());
		 System.out.println(a);
		 System.out.println(a.hashCode());
		
		 

	}

}
