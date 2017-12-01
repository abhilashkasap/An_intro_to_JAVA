class Mainclass15
{
	public static interface Subinterface
	{
		public void show();
		public void edit();
	}
}
class Subclass15 implements Mainclass15.Subinterface
{
	int a;
	String hi;
	public void show()
	{
		System.out.println(a);
		System.out.println(hi);
	}
	public void edit()
	{
		a=50; //newval
		hi="changed Value";
	}
}
public class Implement_static_member_interface15 {
public static void main(String[] args)
{
	Subclass15 ob = new Subclass15();
	ob.show();
	ob.edit();
	ob.show();
}
}
