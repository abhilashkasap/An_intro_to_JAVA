package hello;
import java.util.Scanner;
public class Remove_duplicate_char {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String k=  new String("abbblll");
		//System.out.println("Enter the word");
		
		String n="";
		n= n+ k.charAt(0);
		for(int i=1;i<k.length();i++)
		{   int flag=0;
			for(int j=0;j<n.length();j++)
			if(n.charAt(j)== k.charAt(i))
			{
				flag=1;
			}
			if(flag==0)
				n=n+k.charAt(i);
		}
		System.out.println(n);
		
		
	}

}
