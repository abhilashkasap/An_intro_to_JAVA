package hello;
import java.util.Scanner;
public class Change_case_in_string {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String val = s.nextLine();
	String result="";
	for(int i=0;i<val.length();i++)
	{
		if(java.lang.Character.isLowerCase(val.charAt(i)))
		{
			result=result+java.lang.Character.toUpperCase(val.charAt(i));
		}
		else
		{
			result=result+java.lang.Character.toLowerCase(val.charAt(i));
			
		}
	}
	System.out.println(result);
}
}
