package LambdaExpression;

public class multiParameter {
	public static void main(String[] args) {
		multiparametr m=(a,b)->(a+b);
		System.out.println(m.add(10,200));

	}

}

interface multiparametr {
	public int add(int a,int b);
}
