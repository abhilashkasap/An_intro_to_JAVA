package hello;
import java.util.*;
public class Longest_substring_without_repeat {
public static boolean no_repeat(String s)
{
	int flag=0;
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				flag=1;
				break;
			}
		}
	}
	if(flag==1)
		return false;
	else
		return true;
}
public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	String str;
	System.out.println("Enter the String");
	str= s.nextLine();
	int max_size=0;
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<=str.length();j++)
		{
			String temp= str.substring(i,j);
			//System.out.println(temp);
			//System.out.println(no_repeat(temp));
			if(no_repeat(temp)&&temp.length()>max_size)
			{
				max_size=temp.length();
			}
		}
	}
	System.out.println("Maximum length of required Substring is ="+max_size);
}
}
