package Exception;

public class TestThrow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(17);
		System.out.println("rest of code");

	}

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("Person is not eligiblae for vote");
		} else {
			System.out.println("persion is eligible for vote");

		}
	}

}
