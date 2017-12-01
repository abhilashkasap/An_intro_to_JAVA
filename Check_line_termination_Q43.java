package hello;
import java.util.*;
import java.lang.Character;
public class Check_line_termination_Q43 {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String sentence = "";
	sentence = s.nextLine();
	int l= sentence.length();
	if(sentence.charAt(l-1)=='.'||sentence.charAt(l-1)=='?')
	{
		String result="";
		for(int i=0;i<l;)
		{
			if(i==0)
			{
				result=result+java.lang.Character.toUpperCase(sentence.charAt(i));i++;
			}
			else
				if(sentence.charAt(i)==' ')
				{
					result=result+sentence.charAt(i);
					i++;
					result=result+ java.lang.Character.toUpperCase(sentence.charAt(i));
					i++;
				}
				else
				{
					result=result+sentence.charAt(i);
					i++;
				}
		}
		System.out.println(result);
	}
	else
		System.out.println("Invalid sentence");
}
}
