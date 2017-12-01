package hello;
import java.util.Scanner;
public class Highest_occurred_Character {
public static void main(String[] args)
{
	Scanner s =new Scanner(System.in);
	String val= s.nextLine();
	int a[]=new int[100];
	val =val.toUpperCase();
	for(int i=0;i<val.length();i++)
	{
		a[val.charAt(i)]++;
		
	}
	int max=a[65];int index=65;
	for(int i=66;i<=90;i++)
		if(max<a[i])
		{
			index=i;
			max=a[i];
		}
	System.out.println((char)index); //not  case sensitive
}
}
