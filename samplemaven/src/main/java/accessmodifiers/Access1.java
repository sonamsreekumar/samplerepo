package accessmodifiers;

public class Access1 {
	public void display1()
	{
		System.out.println("This is a public method");
	}
	private void display2()
	{
		System.out.println("This is a private method");
	}
	protected void display3()
	{
		System.out.println("This is a protected method");
	}
	void display4()
	{
		System.out.println("This is a default method");
	}
	public static void main(String[] args) {
		
		Access1 obj = new Access1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}

}
