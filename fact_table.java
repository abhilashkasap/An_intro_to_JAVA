import java.util.*;
class fact_table
{

    public static int fact(int k)
    {
        if(k==0||k==1)
        return 1;
        else
        return k*fact(k-1);
    }
    public static void main(String []args)
    {
       Scanner s= new Scanner(System.in);
       int n;
       n= s.nextInt();
       System.out.println("Factorial of given n = "+ fact(n));
       for(int i=1;i<=10;i++)
       {
          int temp= n*i;
          System.out.println(temp);

       }
    }
}