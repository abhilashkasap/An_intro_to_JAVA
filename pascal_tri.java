package hello;
import java.util.Scanner;
public class pascal_tri {
	public static long fact(long n)
	{
		if(n==0||n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static long ncr(long n,long r)
	{
		return (fact(n)/(fact(n-r)*fact(r)));
	}
	public static void main(String []args)
	{
		
		for(int i=1;i<=10;i++)
		{
			
			int n=i-1;
			for(int s=1;s<=10-i;s++)
				System.out.print(" ");
			for(int j=0;j<=n;j++)
				System.out.print(ncr(n,j)+" ");
			System.out.println();
		}
	}

}
