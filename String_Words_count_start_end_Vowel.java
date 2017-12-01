package hello;
import java.util.Scanner;
public class String_Words_count_start_end_Vowel {
	public static boolean check(String a)
	{
		a = a.toLowerCase();int flag=0;
		if(a.charAt(a.length()-1)=='a'||a.charAt(a.length()-1)=='e'||a.charAt(a.length()-1)=='i'||a.charAt(a.length()-1)=='o'||a.charAt(a.length()-1)=='u')
		flag=1;
		else
			return false;
		if(a.charAt(0)=='a'||a.charAt(0)=='e'||a.charAt(0)=='i'||a.charAt(0)=='o'||a.charAt(0)=='u')
			flag=1;
		else
			return false;
		if(flag==1)
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
		System.out.println("Total words = "+c);
	}

}
