import java.util.*;
class large_among_three
{   public static void large(int a,int b,int c)
     {   System.out.println("largest :-");
         if(a>=b&&a>=c)
         System.out.println(a);
         else
         if(b>=a&&b>=c)
         System.out.println(b);
         else
         if(c>=a&&c>=b)
         System.out.println(c);
     }
    public static void main(String []args)
    {

         System.out.println(" Enter three nos :");
     Scanner s = new Scanner(System.in);
     int a,b,c;
     a= s.nextInt();
     b= s.nextInt();
     c= s.nextInt();
     large(a,b,c);
      
    }
}