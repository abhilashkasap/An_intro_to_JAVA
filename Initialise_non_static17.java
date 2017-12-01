class test17
{
	
	int a;
	{
		a=15;
	}
	test17()
	{
		//giving some default value
		a=5;
		System.out.println("Default value initialised");
	}
	test17(int b)
	{
		a=b;
		System.out.println("External value initialization");
		}
	public void show()
	{
		System.out.println(a);
	}
	
}
public class Initialise_non_static17 {
public static void main(String[] args)
{
	test17 ob= new test17();
	test17 ob1 = new test17(15);
	ob.show();
	ob1.show();
}
}
