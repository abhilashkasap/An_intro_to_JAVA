class Mainclass16
{  static int b=16;
   int z=1;
	public static class Subclass16
	{
		int a;
		String hi;
		public void show()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(hi);
		}
		Subclass16()
		{   b=18;
			a=15;
			hi="Initialized";
		}
	}
}


public class Access_top_levelClass16 {
	public static void main(String[] args)
	{
	Mainclass16.Subclass16 obj = new Mainclass16.Subclass16();
	obj.show();
	}
}
