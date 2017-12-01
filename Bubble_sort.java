package hello;
import java.util.Scanner;
public class Bubble_sort {
public static void bubble_sort(int a[])
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
public static void main(String[] args)
{
	//Scanner s= new Scanner(System.in);
	int a[]={15,12,1,158,36};
	bubble_sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
