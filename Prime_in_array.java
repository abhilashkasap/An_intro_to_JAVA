package hello;
import java.util.Scanner;
public class Prime_in_array {
	public int check_prime(int n)
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
		Prime_in_array obj= new Prime_in_array();
		System.out.println("Enter size of the array");
		int n= s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(obj.check_prime(a[i])==1)
				System.out.println(a[i]);
		}
	}

}
