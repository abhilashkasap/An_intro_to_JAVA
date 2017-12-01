import java.util.*;
class tribonacci
{
    public static void main(String []args)
    {
    int a=0,b=1,c=2;
    System.out.println(a);
System.out.println(b);
System.out.println(c);
    for(int i=1;i<=10;i++)
    {
       int temp=a+b+c;
       System.out.println(temp);
       a=b;
       b=c;
       c=temp;

    }

    }
}