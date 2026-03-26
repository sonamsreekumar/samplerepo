package interfacexample;

public class Childinterface implements Parent{
	public void sum()
	{
		int a=8,b=6;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childinterface obj = new Childinterface();
		//obj.sum();
		//obj.display();
		//obj.print();
		// reference creation - to run just the methods in interface
		Parent ref = new Childinterface();
		ref.display();
		ref.print();
	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a parent interface");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is the second interface method");
		
	}

}
