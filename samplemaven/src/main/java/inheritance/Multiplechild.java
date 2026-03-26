package inheritance;

public class Multiplechild implements Multipleparent1,Multipleparent2{
	public void disp()
	{
		System.out.println("this is a child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplechild obj = new Multiplechild();
		obj.disp();
		obj.display();
		obj.print();
		Multipleparent2 ref = new Multiplechild();
		ref.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is the first interface");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is the second interface");
	}

}
