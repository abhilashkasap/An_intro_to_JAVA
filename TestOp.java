package hello;

public class TestOp {
public static void main(String []args)
{
	int a[] = new int[10];
	System.out.println(a);
	switch(11)
	{
	case 10+23+33: System.out.println("hi");break;
	}
}
}
class parent
{
	int a=5;
}
class child extends parent
{
	int a=10;
	public void print()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
