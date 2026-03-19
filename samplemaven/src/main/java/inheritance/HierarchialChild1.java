package inheritance;

public class HierarchialChild1 extends HierarchialParent {
	public static void print()
	{
		System.out.println("This is the first child");
	}

	public static void main(String[] args) {
		HierarchialParent.display();
		HierarchialChild1.print();
	}

}
