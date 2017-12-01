package hello;
import java.util.Scanner;
import java.lang.Character;
public class Decode_simple_encryption {
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   int shift= s.nextInt();
   if(shift<0||shift>26)
	   System.out.println("invalid value");
   else
   {
	   System.out.println("Input String");
	   String code = "";
	    s.nextLine(); //to feed last newline character
	    code = s.nextLine();
	   code = code.trim();
	   System.out.println(code);
	   for(int i=0;i<code.length();i++)
	   {
		   char ch= code.charAt(i);
		   if(ch==' ')
			   continue;
		   int temp=ch+shift-1;
		   if(temp>90)
		   {
			   temp=temp-90;
			   temp=64+temp;
		   }
		   ch = (char)(temp);
		   if(ch=='Q')
			   {System.out.print(" ");i++;}
		   else
			   System.out.print(ch);
	   }
   }
}

}
