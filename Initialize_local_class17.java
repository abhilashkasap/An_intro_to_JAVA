import java.io.FileOutputStream;

class Mainclass17
{
	class Childclass17
	{
		int a;
		String hi;
		Childclass17()
		{
			a=6;
			hi="SomeValue";
			System.out.println("Initialized");
		}
		public void show()
		{
			System.out.println("Showing Values");
			System.out.println(a);
			System.out.println(hi);
		}
	}
	public Childclass17 getI()
	{  //FileOutputStream ok;
	
		return new Childclass17();
	}
}
public class Initialize_local_class17 {
public static void main(String[] args)
{
	Mainclass17 ob= new Mainclass17();
	Mainclass17.Childclass17 ob1  = ob.getI();
    ob1.show();
	
}
}
