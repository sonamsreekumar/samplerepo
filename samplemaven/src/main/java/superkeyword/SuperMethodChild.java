package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
	public void display()
	{
		System.out.println("this is child class");
		super.print();
		super.sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodChild obj = new SuperMethodChild();
		obj.display();
		//obj.sum();
	}

}
