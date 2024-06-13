package LambdaExpression;

public class Noparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s=()->
		{
			return "hi i am rami";
			
		};
		System.out.println(s.say());

	}

}

interface Sayable {
	public String say();
}
