package hello;
import java.util.Scanner;
public class Transpose {
public static void transpose_matrix(int a[][],int n)
{
	int b[][]= new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			b[i][j]=a[j][i];
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
			System.out.print(b[i][j]+" ");
		System.out.println();
	}
}
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
	transpose_matrix(a,n);
}
}
