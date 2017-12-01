package hello;
import java.util.Scanner;
public class Common_elements_in_array {
public static void matching_elements(int a[],int b[])
{
	int s1=a.length;
	int s2=b.length;
	for(int i=0;i<s1;i++)
	{
		for(int j=0;j<s2;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
				break;
			}
		}
	}
}
public static void main(String[] args)
{
	int a[]={12,15,89,0,67};
	int b[]={15,98,0,1,2};
	matching_elements(a,b);
}
}
