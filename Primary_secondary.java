package hello;

import java.util.Scanner;
public class Primary_secondary {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of the matrix");
		int n=s.nextInt();
		int a[][]= new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=s.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					System.out.println(a[i][j]);
				if(i+j==n-1)
					System.out.println(a[i][j]);
			}
		}
	}
}
