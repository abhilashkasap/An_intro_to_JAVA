class Parent_class
{
	int a=10;
	public void fun()
	{
		System.out.println("Parent Class function");
	}
}
class Child extends Parent_class
{
	int a=5;
	public void fun()
	{
		System.out.println("Child class function");
	}
}

class Method_overriding33b {
	public static void main(String[] args)
	{
	Child ob = new Child();
	ob.fun();
	}


}
