import java.util.*;
class even_and_odd
{
    public static void even(int a)
    {
        for(int i=2;i<a;i+=2)
        {
            if(a%i==0)
            System.out.println(i);
        }
    }
    public static void odd(int a)
    {
        for(int i=1;i<a;i+=2)
        {
            if(a%i==0)
            System.out.println(i);
        }
    }
    public static void main(String []args)
    {
       Scanner s= new Scanner(System.in);
       int a=s.nextInt();
       System.out.println("Options : - ");
       System.out.println(" 1. Even Divisors 2. Odd divisors");
       int c;
       c= s.nextInt();
       switch(c)
       {
           case 1:even(a);break;
           case 2: odd(a);break;
       }

    }
}