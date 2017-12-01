package hello;
import java.util.*;
public class number_name {
public static void main(String []args)
{
	Scanner s= new Scanner(System.in);
	int n= s.nextInt();
	System.out.println(n);
	while(n>0)
	{
		int temp= n%10;
		switch(temp)
		{
		case 1:System.out.print("One ");break;
		case 2:System.out.print("Two ");break;
		case 3:System.out.print("Three ");break;
		case 4:System.out.print("Four ");break;
		case 5:System.out.print("Five ");break;
		case 6:System.out.print("Six ");break;
		case 7:System.out.print("Seven ");break;
		case 8:System.out.print("Eight ");break;
		case 9:System.out.print("Nine ");break;
		case 0:System.out.print("Zero ");break;
		}
		n=n/10;
	}
}
}
