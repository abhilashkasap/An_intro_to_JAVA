package hello;
import java.util.Scanner;
public class Permutation_of_string {
	public static void permute(String a[],int l,int r)
	{
		if(l==r)
		{   String op="";
			for(int i=0;i<a.length;i++)
				op+=a[i]+" ";
			System.out.println(op);
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
			      swap(a,l,i);
				permute(a,l+1,r);
				swap(a,l,i);
			}
		}
	}
	public static void swap(String a[],int i,int j)
	{
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		String value= s.nextLine();
		String[] array = value.split(" ");
		permute(array,0,array.length-1);
	}
}
