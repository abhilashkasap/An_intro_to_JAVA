package hello;
import java.util.*;
public class valid_date {
public static void main(String []args)
{
   Scanner s = new Scanner(System.in);
   int month,date;
   System.out.println("Enter Month and date");
   month= s.nextInt();
   date  = s.nextInt();
   switch(month)
   {
   case 1: if(date<=31)
	        System.out.println("Valid");
   else
	    System.out.println("Invalid");
   break;
   case 2: if(date<=28)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 3:if(date<=31)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 4:if(date<=30)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 5:if(date<=31)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 6:if(date<=30)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 7:if(date<=31)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 8:if(date<=31)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 9:if(date<=30)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 10:if(date<=31)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 11:if(date<=30)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
   case 12:if(date<=31)
       System.out.println("Valid");
else
   System.out.println("Invalid");
break;
default: System.out.println("Invalid month");
      
   }
}
}
