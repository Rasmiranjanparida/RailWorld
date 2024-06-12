package Inheritance;

public class Multilevel {
	public static void main(String[] args) {
      new animal().eat();
      new dog().eat();
      new tiger().eat();
	}
	
}
class animal
{
	void eat()
	{
		System.out.println(" eatting..");
	}
}
class dog extends animal{
	void eat()
	{
		System.out.println(" dog eatting..");
	}
}
class tiger extends dog
{
	{
		super.eat();
		System.out.println(" tiger eatting..");
	}
}

