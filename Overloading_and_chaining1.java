import java.util.Scanner;
public class Overloading_and_chaining1 {
public static void main(String[] args)
{
	parent ob = new parent(20,10);
	ob.show();
}
}
class parent
{
	int a;
	int b;
	parent(int c,int d)
	{   this(c);
		a=c;
		b=d;
		System.out.println("Constructor is called with 2 parameters");
	}
	parent(int c)
	{   this();
		a=c;
		System.out.println("Constructor is called with 1 parameter");
	}
	parent()
	{
		System.out.println("Default Constructor");
	}
	public void show()
	{
		System.out.println(a+ " "+ b);
	}
	
}