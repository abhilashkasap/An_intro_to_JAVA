package hello;
import java.util.*;
public class Merge_two_1D_array {
public static void main(String[] args)
{
	int a[]={1,2,3,4};
	int b[]={5,6,7,8};
	int c[]=new int[a.length+b.length];
	int u=0;
	for(int i=0;i<a.length;i++)
		c[u++]=a[i];
	for(int i=0;i<b.length;i++)
		c[u++]=b[i];
	for(int i=0;i<c.length;i++)
		System.out.print(c[i]+" ");
	
}
}
