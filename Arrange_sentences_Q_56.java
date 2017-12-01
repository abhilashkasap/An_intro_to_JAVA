package hello;
import java.util.Scanner;
public class Arrange_sentences_Q_56 {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String[] val=new String[10];
	for(int i=0;i<10;i++)
		val[i]="";
int c=0;
String paragraph=s.nextLine();
for(int i=0;i<paragraph.length();i++)
{
	if(paragraph.charAt(i)=='.'||paragraph.charAt(i)=='?'||paragraph.charAt(i)=='!')
	{
		val[c]+=paragraph.charAt(i);
		c++;
	}
	else
	val[c]+=paragraph.charAt(i);
}
for(int i=0;i<c;i++)
	System.out.println(val[i]);
	
}
}
