import java.util.Scanner;
public class Checked_and_unchecked_exception45 {
public static void main(String[] args)
{   int n=0;
	Scanner s = new Scanner(System.in);
	try{
	n= s.nextInt();}
	catch(Exception e)
	{
		System.out.println(e);
	}
	try
	{
		n = n/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println(n);
	System.out.println("Rest of the code");
	
}
}
