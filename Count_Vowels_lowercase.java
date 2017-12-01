package hello;
import java.util.Scanner;
public class Count_Vowels_lowercase {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String value= s.nextLine();
	int v,l,u;
	v=l=u=0;
	for(int i=0;i<value.length();i++)
	{
		if(java.lang.Character.isLowerCase(value.charAt(i)))
			l++;
		else
			if(java.lang.Character.isUpperCase(value.charAt(i)))
				u++;
		if(value.charAt(i)=='a'||value.charAt(i)=='e'||value.charAt(i)=='i'||value.charAt(i)=='o'||value.charAt(i)=='u')
			v++;
		if(value.charAt(i)=='A'||value.charAt(i)=='E'||value.charAt(i)=='I'||value.charAt(i)=='O'||value.charAt(i)=='U')
			v++;
		
	}
	System.out.println("Vowels = "+v);
	System.out.println("Lowercase = "+l);
	System.out.println("Uppercase = "+u);
}
}
