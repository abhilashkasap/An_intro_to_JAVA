
import java.util.*;
class triangle
{
    public static void test(int a,int b,int c)
    {
        if(((a+b)>c)&&((a+c)>b)&&((c+b)>a))
        {
            if(a==b&&b==c)
            {
                System.out.println("Triangle is equilateral ");

            }
            else
            if(a==b||b==c||a==c)
            {
            
                System.out.println("Triangle is Iso.");
            }
            else
            if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)||(a*a)+(c*c)==(b*b))
            {
                    System.out.println("Triangle is Right angle");
            }
                else
                {
                       System.out.println("Triangle is scalene");
                }

            
        }
        else
        {
            System.out.println("Not a valid triangle");
        }
    }
public static void main(String []args)
{

  System.out.println(" Enter three sides:");
     Scanner s = new Scanner(System.in);
     int a,b,c;
     a= s.nextInt();
     b= s.nextInt();
     c= s.nextInt();
     test(a,b,c);
}
}