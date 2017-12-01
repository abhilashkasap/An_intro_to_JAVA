package hello;
import java.util.*;
public class long_range {
public static long fact(int n)
{
	if(n==0||n==1)
		return 1;
	else
		return n*fact(n-1);
}
public static void main(String []args)
{
	int n=3;
	long f= fact(n);
	while(f>0)
	{
		n++;
		f= fact(n);
	}
	System.out.println(n-1);
}
}
