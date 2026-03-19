package polymorphism;

public class Child extends Parent {
	public void display(String s)
	{	
		super.display("automation");
		System.out.println(s);
		System.out.println("child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.display("java");
	}

}
