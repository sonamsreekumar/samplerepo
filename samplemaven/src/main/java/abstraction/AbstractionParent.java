package abstraction;

public abstract class AbstractionParent {
	public abstract void display();
	public abstract void print();
	public void sum()
	{
		int a=4;
		int b=5;
		int c=a=b;
		System.out.println("Sum is : " + c);
	}

}
