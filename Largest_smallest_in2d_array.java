package hello;
import java.util.*;
public class Largest_smallest_in2d_array {

	public static int largest(int a[][],int m,int n)
	{ 
		int max=a[0][0];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				if(a[i][j]>max)
					max=a[i][j];
		}
		return max;
	}
	public static int smallest(int a[][],int m,int n)
	{ 
		int min=a[0][0];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				if(a[i][j]<min)
					min=a[i][j];
		}
		return min;
	}
	public static void main(String[] args)
	{
		int m,n;
		System.out.println("Enter Size m and n");
		Scanner s= new Scanner(System.in);
		m= s.nextInt();
		n=s.nextInt();
		int a[][]=new int[m][n];
        System.out.println("Enter Values in array");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        		a[i][j]=s.nextInt();
        }
        System.out.println(largest(a,m,n));
        System.out.println(smallest(a,m,n));
	}
}
