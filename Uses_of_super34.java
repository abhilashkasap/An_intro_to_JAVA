class Parent34
{
	int a=15;
	Parent34()
	{
		System.out.println("Parent class Constructor");
	}
	public void fun()
	{
		System.out.println("Parent class function");
	}
}
class Child34 extends Parent34
{
	int a=20;
	Child34()
	{   super();
		System.out.println("Child class Constructor");
	}
	public void fun()
	{   super.fun();
		System.out.println("Child class function");
	}
	public void print_val()
	{
		System.out.println("child class a = "+a);
		System.out.println("parent class a = "+super.a);
		
	}
}
public class Uses_of_super34 {
public static void main(String[] args)
{
	Child34 ob= new Child34();
	ob.fun();
	ob.print_val();
}
}
