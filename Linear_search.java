package hello;
import java.util.Scanner;
public class Linear_search {
public static boolean search(int a[],int val)
{
	int size = a.length;
	for(int i=0;i<size;i++)
		if(a[i]==val)
			return true;
	return false;
}
public static void main(String[] args)
{
	int a[]={36,25,14,85,100,457};
	Scanner s = new Scanner(System.in);
	int t= s.nextInt();
	System.out.println(search(a,t));
}
}
