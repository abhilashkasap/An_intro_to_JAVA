package hello;
import java.util.Scanner;
public class Convert_binary {
	public static String convert_binary(int d)
	{
		if(d==0)
			return "";
		else
		{
			int rem=d%2;
			String temp= convert_binary(d/2);
			temp= temp+rem;
			return temp;
		}
	}
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	int d= s.nextInt();
	String binary=java.lang.Integer.toBinaryString(d);
	System.out.println(binary);
	System.out.println(convert_binary(d));
}
}
