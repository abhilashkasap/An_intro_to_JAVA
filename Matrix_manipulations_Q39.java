package hello;
import java.util.*;
public class Matrix_manipulations_Q39 {
	public static void sort(int a[])
	{
		int size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
public static void get_boundary(int a[][],int m)
{
	int size=4*m-4;
	int newa[]=new int[size];
	int counter=0;
	int i;
	for(i=0;i<m;i++)
		newa[counter++]=a[0][i];
	for(i=1;i<m;i++)
		newa[counter++]=a[i][m-1];
	for(i=m-2;i>=0;i--)
		newa[counter++]=a[m-1][i];
	for(i=m-2;i>=1;i--)
		newa[counter++]=a[i][0];
	sort(newa);
	counter=0;
	for(i=0;i<m;i++)
		a[0][i]=newa[counter++];
	for(i=1;i<m;i++)
		a[i][m-1]=newa[counter++];
	for(i=m-2;i>=0;i--)
		a[m-1][i]=newa[counter++];
	for(i=m-2;i>=1;i--)
		a[i][0]=newa[counter++];
	
		
}
public static int add_diagonal(int a[][],int m)
{
	int sum=0;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(i==j)
			{
				sum+=a[i][j];
			}
			else
				if(i+j==m-1)
				{
					sum+=a[i][j];
				}
		}
	}
	return sum;
}
public static void main(String[] args)
{
	int m;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Size :");
	m= s.nextInt();
	int a[][]=new int[m][m];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			a[i][j]=s.nextInt();
		}
	}
	System.out.println("Displaying original Matrix :");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	get_boundary(a,m);
	System.out.println("Displaying New Matrix :");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println(add_diagonal(a,m));
	
}

}
