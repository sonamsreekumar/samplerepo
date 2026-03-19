package inheritance;

public class MultilevelParent extends MultilevelGrandparent{

	public int sum(int a, int b) 
	{
	int c=a+b;
	System.out.println("This is an intermediate class");
	return c;
	}

}
