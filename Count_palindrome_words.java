package hello;
import java.util.Scanner;
public class Count_palindrome_words {
public static boolean check(String a)
{
	String result="";
	for(int i=a.length()-1;i>=0;i--)
	{
		result=result+a.charAt(i);
	}
	//System.out.println(result+" "+a);
	if(result.equals(a))
		return true;
	else
		return false;
	
}
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String value= s.nextLine();
	String array[]=value.split(" ");
	int c=0;
	for(int i=0;i<array.length;i++)
	{  // boolean var= check(array[i]);
	    //System.out.println(var);
		if(check(array[i]))
		{
         			c++;
		}
		
	}
	System.out.println("Total no of palindrome words = "+c);
}
}
