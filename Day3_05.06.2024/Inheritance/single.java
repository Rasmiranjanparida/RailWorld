package Inheritance;

public class single {
	public static void main(String[] args) {
		new Animal1().eat();
		new cat().eat();		
	}

}
class Animal1
{
	void eat()
	{
		System.out.println(" eatting..");
	}
}
class cat extends Animal1{
	void eat()
	{
		System.out.println(" cat eatting..");
	}
}