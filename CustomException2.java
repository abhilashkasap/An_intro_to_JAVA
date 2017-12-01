
class valueexception extends Exception
{
	String msg = "This value not possible";
	valueexception(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}
}
public class CustomException2 {
public static void main(String[] args)
{
	try
	{
		int a=1;
		if(a==1)
			throw new valueexception("This value is not possible");
	}
	catch(valueexception e)
	{
		System.out.println(e);
	}
}
}
