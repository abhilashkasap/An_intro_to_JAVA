package hello;
import java.util.Scanner;
public class String_contains_digit_or_not {
public static void main(String[] args)
{
	int flag=0;
	Scanner s=new Scanner (System.in);
	String value= s.nextLine();
	for(int i=0;i<value.length();i++)
	{
		if(value.charAt(i)>='0'&&value.charAt(i)<='9')
			flag=1;
	}
	if(flag==1)
		System.out.println("String is containing a digit");
	else
		System.out.println("String is not containing digit");
}

}
