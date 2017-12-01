package hello;
import java.util.Scanner;
public class Selection_sort {
public static void selection_sort(int a[])
{
int size= a.length;
for(int i=0;i<size;i++)
{
	int min=a[i];
	int index=i;
	for(int j=i;j<size;j++)
	{   
	
		if(a[j]<min)
		{
			min=a[j];
			index=j;
		}
	}
	//System.out.println(index);
	int temp=a[i];
	a[i]=a[index];
	a[index]=temp;
}
}
public static void main(String[] args)
{
	int a[]= {35,1,-85,8457,45,965};
	selection_sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
