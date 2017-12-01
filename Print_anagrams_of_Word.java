package hello;
import java.util.Scanner;
public class Print_anagrams_of_Word {
public static String swap(String a,int i,int j)
{
	char ch[]=a.toCharArray();
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	
	return String.valueOf(ch);
}
public static void permute(String a,int l,int r)
{
	if(l==r)
		System.out.println(a);
	else
	{
		for(int i=l;i<=r;i++)
		{
			a= swap(a,l,i);
			permute(a,l+1,r);
			a=swap(a,l,i);
		}
	}
}
public static void main(String[] args)
{
	String a="NICK";
	int r=a.length();
	permute(a,0,r-1);
}
}
