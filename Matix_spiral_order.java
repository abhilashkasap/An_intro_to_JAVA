package hello;
import java.util.Scanner;
public class Matix_spiral_order {
	public static void main(String []args)
	{
Scanner s= new Scanner(System.in);
System.out.println("Enter Size of Square MatriX");
int n=s.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		a[i][j]=s.nextInt();
	}
}
int b=0;int e=n-1;int j,k,l,m;
j=b;
k=b;
for(int i=0;i<=n-2; )
{
	
	for( ;j<=e;j++)
		System.out.println(a[k][j]);
	j--;
	k++;
	
	for( ;k<=e;k++)
		System.out.println(a[k][j]);
	k--;
	j--;
	e--;
	for(; j>=b;j--)
		System.out.println(a[k][j]);
	j++;
	k--;
	for(;k>b;k--)
		System.out.println(a[k][j]);
	k++;
	j++;
	b++;
	i++;
	
}
}
}
