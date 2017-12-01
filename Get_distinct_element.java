package hello;
import java.util.*;
public class Get_distinct_element {
	public static boolean find(int a[],int val)
	{
		int size= a.length;
		for(int i=0;i<size;i++)
			if(a[i]==val)
				return true;
		return false;
	}
public static void main(String[] args)
{
	int a[]={12,15,39,12,58,15,98,39,15};
	int result[]=new int[a.length];
	int c=0;
	for(int i=0;i<a.length;i++)
	{
		if(find(result,a[i]))
		{
		continue;	
		}
		else
		{
			result[c]=a[i];
			c++;
		}
	}
	System.out.println("Printing Distinct elements array:");
	for(int i=0;i<c;i++)
		System.out.println(result[i]);
}
}
