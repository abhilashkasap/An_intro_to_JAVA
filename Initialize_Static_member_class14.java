class Mainclass14
{
	public static class Subclass14
	{
		int a;
		String hi;
		public void show()
		{
			System.out.println(a);
			System.out.println(hi);
		}
		Subclass14()
		{
			a=15;
			hi="Initialized";
		}
	}
}
public class Initialize_Static_member_class14 {
public static void main(String[] args)
{
	Mainclass14.Subclass14 obj = new Mainclass14.Subclass14();
	obj.show();
}
}
