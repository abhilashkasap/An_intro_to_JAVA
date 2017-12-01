package hello;
import java.util.Scanner; 
public class even_and_odd_divisor {
public static void check_divisor(int num,int b)
{
	if(num%b==0)
	{
		if(b%2==0)
			System.out.println("Even Divisor = "+b);
		else
			System.out.println("odd Divisor = "+b);
			
	}
}
public static void main(String []args)
{
	int a;
	Scanner s = new Scanner(System.in);
	a= s.nextInt();
	for(int i=1;i<a;i++)
	{
		
	 check_divisor(a,i);
	}
	
}


}
