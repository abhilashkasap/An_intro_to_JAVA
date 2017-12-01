package hello;
import java.util.Scanner;
public class Invertible {
//check 3*3 matrix is invertible or not 
	public static int det3(int a[][])
	{
		int d1= a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]);
		int d2= a[0][1]*(a[0][0]*a[2][2]-a[0][2]*a[2][0]);
		int d3= a[0][2]*(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
		int final_value= d1-d2+d3;
		return final_value;
	}
	public static void main(String []args)
	{
		Scanner s= new Scanner(System.in);
		int a[][]= new int[3][3];
		System.out.println("Enter Values in array:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		if(det3(a)==0)
			System.out.println("Matrix is not invertible");
		else
			System.out.println("Matrix is invertible");
		
	}
}
