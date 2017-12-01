package hello;
import java.util.Scanner;
import java.lang.Integer;
import java.lang.*;
public class Check_number_is_binary {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	double binary_val=s.nextDouble();
	String check_val= Double.toString(binary_val);
	int flag=1;int dot_count=0;
	for(int i=0;i<check_val.length();i++)
	{   // System.out.println(check_val.charAt(i));
		if(check_val.charAt(i)=='0'||check_val.charAt(i)=='1')
			continue;
		else
			if(check_val.charAt(i)=='.'&&dot_count==0)
			{
				dot_count++;
			}
			else
			{
				flag=0;
				break;
			}
	}
	
	if(flag==0)
	{
		System.out.println("Not a binary String");
		
	}
	else
		System.out.println("Binary String");
}
}
