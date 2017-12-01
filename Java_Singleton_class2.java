class Singleton
{  
	int num=0;
	String hi="hello";
	public static Singleton obj=null;
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		if(obj==null)
			obj = new Singleton();
		return obj;
	}
	public void show()
	{
		System.out.println(num);
		System.out.println(hi);
	}
}
public class Java_Singleton_class2 {
public static void main(String[] args)
{
	Singleton newobj = Singleton.getInstance();
	Singleton secobj = Singleton.getInstance();
	newobj.show();
	secobj.show();
	secobj.hi = secobj.hi.toUpperCase();
	newobj.show();
	secobj.show();
}
}

