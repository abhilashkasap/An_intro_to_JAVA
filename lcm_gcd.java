package hello;
import java.util.*;
public class lcm_gcd {
public static int gcd(int a,int b)
{
	if(a<=b)
	{
		if(b%a==0)
			return a;
		else
		{
			int temp = b%a;
			b=a;
			a=temp;
			return (gcd(a,b));
		}
	}
	else
	{
		if(a%b==0)
			return b;
		else
		{
			int temp = a%b;
			a=b;
			b=temp;
			return (gcd(a,b));
		}
	}
}
public static void main(String []args)
{
	int a,b;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Two nos");
	a= s.nextInt();
	b= s.nextInt();
	System.out.println("GCD of two nos = "+gcd(a,b));
	int lcm= (a*b)/gcd(a,b);
	System.out.println("LCM of two nos =  "+lcm);
	
}
}
