package hello;
import java.util.Scanner;
public class Remove_multiple_spaces {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String val = s.nextLine();
	val = val.trim();
	int space_count=0;
	for(int i=0;i<val.length();i++)
	{
		if(val.charAt(i)==' '&&space_count==1)
		{
			val = val.substring(0,i)+val.substring(i+1,val.length());
			i--;
			//System.out.println("Space reduce= "+val+i);
		}
		else
			if(val.charAt(i)==' '&&space_count==0)
			{// System.out.println("0 space run"+i);
				space_count=1;
			}
			else
			{//System.out.println("other c  space run"+i);
				space_count=0;
			}
	}
	System.out.println(val);
}
}