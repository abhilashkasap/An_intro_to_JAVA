package hello;

import java.util.Scanner;

public class Fact_in_table {
public static int fact(int n)
{
	if(n==0||n==1)
		return 1;
	else
	{
		return (n*fact(n-1));
	}
}
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no:");
	int n=s.nextInt();
	for(n=1;n<=1000;n++)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(n*i);
	}
	System.out.println(fact(n));
	}
	
}
}
