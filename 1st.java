import java.util.*;
class swap
{


    public static void main(String []args)
    {
     System.out.println(" Enter Two nos :");
     Scanner s = new Scanner(System.in);
     int a,b;
     a= s.nextInt();
     b= s.nextInt();
     System.out.println("Swap with temp var");
     int temp;
        temp=a;
        a=b;
        b=temp;
     System.out.println("a = "+a +"and b = "+b);
     System.out.println("Swap without temp var");
       a=a+b;
        b=a-b;
        a=a-b;
     
     System.out.println("a = " +a+ "and b = "+b);
    }
}