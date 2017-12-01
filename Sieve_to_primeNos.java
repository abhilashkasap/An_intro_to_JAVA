package hello;

public class Sieve_to_primeNos {
	
public static void main(String[] args)
{
	int flag_array[] = new int[100];
	int start=2;
	boolean found=true;
	while(start<100&&found)
	{  found=false;
		//System.out.println("Loop");
		int temp=2*start;
		while(temp<100)
		{
			flag_array[temp]=1;
			temp+=start;
		}
		
		for(int i=2;i<100;i++)
		{
			if(flag_array[i]!=1&&i>start)
			{
				start=i;
				found=true;
				break;
			}
		}
		//System.out.println(start);
		
	}
	for(int i=2;i<100;i++)
	{
		 if(flag_array[i]!=1)
			System.out.println(i);
	}
}
}
