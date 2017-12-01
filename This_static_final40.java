class parent40
{
	static int a=10;
	parent40(int a)
	{
		this.a=a;
	}
	parent40()
	{
		
	}
	final int b=40;
	public final void show()
	{
		System.out.println(a+ " "+ b);
	}
}
class child40 extends parent40
{
	/* Overriding show function will give compilation error */
	/* 
	 * public void show()
	 * {
	 *    System.out.println("Overridden Function");
	 * }
	 */
	child40(int b)
	{   super(b);
		this.show();
	}
}
public class This_static_final40 {
public static void main(String[] args)
{
	child40 ob1= new child40(5);
	child40 ob2= new child40(45);
	ob1.show();
	ob2.show();
	
}
}
