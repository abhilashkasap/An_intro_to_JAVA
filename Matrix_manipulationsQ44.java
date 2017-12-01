package hello;
import java.util.Scanner;
public class Matrix_manipulationsQ44 {
public static void main(String[] args)
{
	Scanner s = new Scanner (System.in);
	int m;
	m= s.nextInt();
	if(m<=2||m>10)
		System.out.println("Invalid");
	else
	{
		int a[][]=new int[m][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
				a[i][j]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		int sum=a[0][0]+a[0][m-1]+a[m-1][m-1]+a[m-1][0];
		System.out.println("Sum of corner elements = "+sum);
	}
}
}
