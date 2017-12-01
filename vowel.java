

import java.util.*;
class vowel
{
   public static void main(String []args)
   {
       Scanner s= new Scanner(System.in);
       char ch;
       ch= s.next().charAt(0);
       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       System.out.println(" Character is vowel");
       else
       if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
       System.out.println(" Character is vowel");
       else
       System.out.println("not a vowel");
       
   }



}