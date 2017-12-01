package hello;

import java.util.Scanner;

public class Sort_word_lexicographically {
public static void sort(String[] array)
{
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array.length-1;j++)
		{
			if(array[j].compareToIgnoreCase(array[j+1])>0)
			{
				String temp=array[j+1];
				array[j+1]=array[j];
				array[j]=temp;
			}
		}
	}
}
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String value= s.nextLine();
	String array[]=value.split(" ");
	sort(array);
	for(int i=0;i<array.length;i++)
		System.out.println(array[i]);
}
}
