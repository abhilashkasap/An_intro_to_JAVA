package hello;
import java.util.Scanner;
public class Print_boundary_of_matrix {
	public static void get_boundary(int a[][],int m,int n)
	{
		int size=2*m+2*n-4;
		int newa[]=new int[size];
		int counter=0;
		int i;
		for(i=0;i<n;i++)
			newa[counter++]=a[0][i];
		for(i=1;i<m;i++)
			newa[counter++]=a[i][n-1];
		for(i=n-2;i>=0;i--)
			newa[counter++]=a[m-1][i];
		for(i=m-2;i>=1;i--)
			newa[counter++]=a[i][0];
		for(i=0;i<counter;i++)
			System.out.println(newa[i]);
		
		}
	public static void main(String[] args)
	{
		int m,n;
		Scanner s= new Scanner(System.in);
		m= s.nextInt();
		n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		get_boundary(a,m,n);
	}

}
