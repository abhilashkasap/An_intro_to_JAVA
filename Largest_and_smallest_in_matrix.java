package hello;
import java.util.Scanner;
public class Largest_and_smallest_in_matrix {
public static int digit_sum(int n)
{
	int temp=0;
	if(n/10==0)
		return n;
	else
	{
		while(n>0)
		{
			temp+=n%10;
			n=n/10;
		}
		return temp;
	}
}
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter The size of the matrix:");
	int m,n;
	m=s.nextInt();
	n=s.nextInt();
	int a[][]=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	
	int max=a[0][0];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(max<a[i][j])
				max=a[i][j];
		}
	}

	int min=a[0][0];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(min>a[i][j])
				min=a[i][j];
		}
	}
	System.out.println(digit_sum(max));
	System.out.println(digit_sum(min));


}
}
