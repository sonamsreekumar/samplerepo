package exceptionhandling;

public class ExceptionVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		if (age >= 18)
		{
			System.out.println("This person is eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Age is under 18");
		}

	}

}
