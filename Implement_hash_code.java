package hello;
import java.util.Scanner;
public class Implement_hash_code {
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	String a="default";
	String b;
	int hash1,hash2;
	b= s.next();
	hash1=  a.hashCode();
	hash2= b.hashCode();
	if(hash1==hash2)
	{
		System.out.println("Correct String guess");
	}
	else
	{
		System.out.println("String guess is not correct");
	}
	
}
}
