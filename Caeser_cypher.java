package hello;
import java.util.Scanner;
public class Caeser_cypher {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String val = s.nextLine();
	if(val.length()<4||val.length()>100)
		System.out.println("invalid");
	else
	{
	for(int i=0;i<val.length();i++)
	{
		if((val.charAt(i)>='a'&&val.charAt(i)<='z')||(val.charAt(i)>='A'&&val.charAt(i)<='Z'))
		{    int temp= val.charAt(i)+13;
		if(temp>122&&(val.charAt(i)>='a'&&val.charAt(i)<='z'))
		{
			temp=temp-122;
			temp=96+temp;
		}
		else
			if(temp>90&&(val.charAt(i)>='A'&&val.charAt(i)<='Z'))
			{
				temp=temp-90;
				temp=64+temp;
			}
			System.out.print((char)temp);
		}
		else
			System.out.print(val.charAt(i));
	}
}
}
}
