package hello;
import java.util.Scanner;
public class Print_prime_factors {
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
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			if(check_prime(i)==1)
			{
				if(n%i==0)
					System.out.println(i);
			}
		}
	}
}
