package hello;
import java.util.Scanner;
public class Matrix_mul {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int m,n,p,q;
		System.out.println("Enter Size of first matrix (m*n)");
		m=s.nextInt();
		n=s.nextInt();
		System.out.println("Enter Size of Second matrix (p*q)");
		p= s.nextInt();
		q=s.nextInt();
		if(n!=p)
		{
			System.out.println("Matrix cannot be multiplied");
		    	
		}
		else
		{   int a[][]= new int[m][n];
		     int b[][]=new int[p][q];
		     int c[][]=new int[m][q];
			System.out.println("Enter Elements of First Matrix :");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					a[i][j]=s.nextInt();
					
			}
			System.out.println("Enter Elements of Second Matrix :");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<q;j++)
					b[i][j]=s.nextInt();
					
			}
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<q;j++)
				{
					int sum=0;
					for(int l=0;l<n;l++)
					{ 
						sum+=a[i][l]*b[l][j];
					}
					c[i][j]=sum;
				}
			}
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<q;j++)
					System.out.println(c[i][j]);
					
			}
		}
		
	}

}
