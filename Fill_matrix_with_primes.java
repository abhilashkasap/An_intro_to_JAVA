package hello;
import java.util.*;
public class Fill_matrix_with_primes {
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
	public static void main(String[] args)
	{
		int m,n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The value of m and n");
	    m= s.nextInt();
	    n= s.nextInt();
	    int a[][]=new int[m][n];
	    int count =0;int i,j;i=j=0;int prime=2;
	    while(count<m*n)
	    {
	    	if(j==n)
	    		{j=0;
	    	     i++;
	    		}
	    	
	    	if(check_prime(prime)==1)
	    	{   //System.out.println(i+" "+j);
	    		a[i][j]=prime;
	    		j++;
	    		prime++;
	    		count++;
	    		//System.out.println(count);
	    	}
	    	else
	    		prime++;
	    }
	    for(i=0;i<m;i++)
	    {
	    	for(j=0;j<n;j++)
	    		System.out.print(a[i][j]+" ");
	    	System.out.println();
	    }
	}
}
