package hello;
import java.util.Scanner;
public class Twin_primes {
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
	{
		for(int i=2;i<=100;i++)
		{
			if(check_prime(i)==1)
			{
				if(check_prime(i+2)==1)
					System.out.println(i+ " " + (i+2));
			}
		}
	}
}
