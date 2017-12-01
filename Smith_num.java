package hello;
import java.util.Scanner;
public class Smith_num {
public static int check_prime(int n)
{
	int flag=0;
	for(int i=2;i<n;i++)
		if(n%i==0)
		{	flag=1;break;}
	if(flag==1)
		return 0;
	else
		return 1;
}
public static int digit_sum(int n)
{
	if(n/10==0)
		return n;
	else
	{
		int temp=0;
		while(n>0)
		{
			temp+=n%10;
			n=n/10;
		}
		return temp;
	}
}
public static void main(String []args)
{
	Scanner s= new Scanner(System.in);
	int original = s.nextInt();
	int original_sum= digit_sum(original);
	int n=original;
	int sum=0;
	for(int i=2;i<n;)
	{
		if(check_prime(i)==1)
		{
			if(original%i==0)
			{  System.out.println(i);
				sum+=digit_sum(i);
				original=original/i;
				
			}
			else
				i++;
		}
		else
			i++;
		
	}
	if(original_sum==sum)
		System.out.println("given no is smith no");
	else
		System.out.println("Given no is not a smith no");
	
	
}
}
