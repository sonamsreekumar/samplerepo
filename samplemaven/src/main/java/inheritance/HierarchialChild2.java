package inheritance;

public class HierarchialChild2 extends HierarchialParent {
	public static void print()
	{
		System.out.println("This is the first child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChild2 obj = new HierarchialChild2();
		obj.display("java");
		HierarchialParent.display();
		HierarchialChild2.print();
	}

}
