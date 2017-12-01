
public class Copy_constructor46 {
	public static void main(String[] args)
	{
		Example46 ob1 = new Example46();
		Example46 ob2 = new Example46(ob1);
		ob1.show();
		ob2.show();
	}

}
class Example46
{
	int a;
	int b;
	Example46()
	{
		a=20;
		b=20;
	}
	Example46(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Example46(Example46 obj)
	{
		this.a=obj.a;
		this.b=obj.b;
	}
	public void show()
	{
		System.out.println("Values :");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
