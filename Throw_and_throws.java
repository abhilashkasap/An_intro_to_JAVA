import java.io.*;
public class Throw_and_throws {
public static void main(String[] args) throws ArithmeticException
{
	int n=0;;
	
	int b=15;
	try
	{
		b=b/n;
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("Mid-way");
	throw new ArithmeticException("Wrong entry");
}
}
