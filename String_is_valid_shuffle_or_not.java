package hello;
import java.util.Scanner;
public class String_is_valid_shuffle_or_not {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String first= s.nextLine();
	String second = s.nextLine();
	String third = s.nextLine();
	//System.out.println(first+" "+second+" "+third);
	int flag=0;int fc=0;int sc=0;
	for(int i=0;i<third.length();i++)
	{
		if(fc<first.length()&&third.charAt(i)==first.charAt(fc))
		{
			fc++;
			flag=1;
		}
		else
			if(sc<second.length()&&third.charAt(i)==second.charAt(sc))
			{
				sc++;
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
	}
	if(flag==0)
	{
		System.out.println("Not a valid Shuffle");
		
	}
	else
		System.out.println("Valid Shuffle");
}
}
