package hello;
import java.util.Scanner;
public class Count_vowels_in_each_word {
public static int count_vowels(String val)
{
	int c=0;
	val =val.toLowerCase();
	for(int i=0;i<val.length();i++)
	{
		if(val.charAt(i)=='a'||val.charAt(i)=='e'||val.charAt(i)=='i'||val.charAt(i)=='o'||val.charAt(i)=='u')
			c++;
	}
	return c;
}
public static void main(String[] args)
{
	Scanner s=new Scanner (System.in);
	String value= s.nextLine();
	String[] array = value.split(" ");
	int size = array.length;
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		a[i]=count_vowels(array[i]);
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
}
}
