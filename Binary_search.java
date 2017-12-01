package hello;
import java.util.Scanner;
public class Binary_search {
public static boolean search(int a[],int val)
{
   int l=0;
   int r=a.length-1;
   int mid=(l+r)/2;
   if(a[mid]==val)
	   return true;
   while(l<=r)
   {
	   if(val<a[mid])
		   r=mid-1;
	   else
		   l=mid+1;
	   mid= (l+r)/2;
	   if(a[mid]==val)
		   return true;
   }
   return false;
}
public static void main(String[] args)
{
	int a[]={10,12,25,55,102,965};
	Scanner s = new Scanner(System.in);
	int t= s.nextInt();
	System.out.println(search(a,t));
}
}
