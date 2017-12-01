package hello;
import java.util.Scanner;
//here arrays are already intialized in the program 
public class Determinant {
	
	public static int det2(int a[][])
	{
	     int d = (a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
	     return d;
	}
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
		System.out.println("Enter Value of n ( 2 or 3)");
		int n=s.nextInt();
		if(n==2)
		{
			int a[][]= {{2,3},{4,5}};//hardcoded array values
			System.out.println(det2(a));
		}
		else
		{
			int a[][]={{1,2,3},{-2,5,-2},{5,6,7}}; //hardcoded array values
			System.out.println(det3(a));
		}
	}

}
