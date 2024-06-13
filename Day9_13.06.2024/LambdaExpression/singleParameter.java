package LambdaExpression;

public class singleParameter {
	public static void main(String[] args) {
		Sayable1 s = (name) -> {
			return name;

		};
		System.out.println(s.m1("hi i am here"));
	}

}

interface Sayable1 {
	public String m1(String s);
}
