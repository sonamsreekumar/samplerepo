package inheritance;

public class MultilevelChild extends MultilevelParent{
	public void print()
	{
		System.out.println("this is a child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelChild obj = new MultilevelChild();
		obj.print();
		int sum = obj.sum(5,2);
		obj.display();
		System.out.println("sum is :" + sum);
	}

}