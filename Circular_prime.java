package hello;
import java.util.Scanner;
public class Circular_prime {
	public static int check_prime(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
			if(n%i==0)
			{	flag=1;break;}
		if(flag==1)
			return 0;
		else
			return 1;
	}
public static void main(String[] args)
{   int flag=0;
	Scanner  s =new Scanner(System.in);
	int n=s.nextInt();
	int temp1= n;
	if(check_prime(n)==1)
	{  flag=1;
		while(true)
		{
			String temp= java.lang.Integer.toString(temp1);
			char beg= temp.charAt(0);
			temp= temp.substring(1);
			temp=temp+beg;
			temp1= java.lang.Integer.parseInt(temp);
			//System.out.println(temp1);
			if(temp1==n)
				break;
			if(check_prime(temp1)==1)
			{
				flag=1;;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("No is Circular prime");
		}
		else
		{
			System.out.println("No is not Circular prime");
		}
	}
	else
	{
	 System.out.println("Number is not circular prime");
	}
}
}
