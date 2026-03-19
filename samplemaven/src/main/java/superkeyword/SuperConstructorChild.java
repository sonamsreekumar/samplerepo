package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent {

	public SuperConstructorChild()
	{ 
		super();
		System.out.println("This is a child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorChild obj = new SuperConstructorChild();
	}

}
