package hello;

public class prime_bet_1to1000 {
public static void check_prime(int n)
{
	int flag=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println(n);
}
public static void main(String []args)
{
	for(int i=1;i<=1000;i++)
		check_prime(i);
}
}
