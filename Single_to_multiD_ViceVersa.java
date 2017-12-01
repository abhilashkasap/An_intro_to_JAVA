package hello;
import java.util.Scanner;
public class Single_to_multiD_ViceVersa {
	static Scanner s = new Scanner(System.in);
public static void Multi_to_Single(int a[][],int m,int n)
{
	int size= m*n;
	int newa[]=new int[size];
	int counter=0;
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			newa[counter++]=a[i][j];//row major coversion
		}
	}
	for(int i=0;i<counter;i++)
		System.out.print(newa[i]+"  ");
}
public static void Single_to_multi(int a[],int size)
{   
	int m,n;
	System.out.println("Enter m,n :");
	m= s.nextInt();
	n= s.nextInt();
	int newa[][]=new int[m][n];
	if(m*n>size||m*n<size)
	{
		System.out.println("Cannot create the 2D array");
		return ;
	}
	else
	{   int counter=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				newa[i][j]=a[counter++];
			}
		}
	}
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(newa[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
public static void main(String[] args)
{
	int a[][]={{1,2},{2,4}};
	int b[]={2,3,4,5};
	Single_to_multi(b,4);
	Multi_to_Single(a,2,2);
}
}
