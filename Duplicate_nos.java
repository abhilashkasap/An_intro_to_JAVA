package hello;
import java.util.*;
public class Duplicate_nos {
public static void main(String[] args)
{   int flag=0;
	int a[]={12,78,45,34,11,9,854,400};
	System.out.println("enter a no:");
	Scanner s = new Scanner(System.in);
	int temp= s.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==temp)
		{
			System.out.println("duplicate no ");
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("Not a duplicate no");
	}
}
}
