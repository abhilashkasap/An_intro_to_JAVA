package hello;
import java.util.*;
public class Remove_html_tag {
	
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String val= s.nextLine();
	int beg=0,end=0;
	for(int i=0;i<val.length();i++)
	{
		if(val.charAt(i)=='<')
			beg=i;
	}
	for(int i=0;i<val.length();i++)
	{
		if(val.charAt(i)=='>')
			end=i;
	}
	val = val.substring(0,beg)+val.substring(end+1,val.length());
	System.out.println(val);
}
}
