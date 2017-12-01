import java.util.*;
class check_all
{
    public static  void check_armstrong(int a)
    {
        int temp=a;
        int cube=0;
        while(temp>0)
        {
            int r= temp%10;
            cube+=(r*r*r);
            temp=temp/10;
        }
        if(a==cube)
        System.out.println("Numbe is armstrong !!");
        else
        System.out.println("Numbe is not armstrong !!");
        
    }
    public static void check_palindrome(int a)
    {
    int temp=a;
        int cube=0;
        while(temp>0)
        {
            int r= temp%10;
            cube=cube*10+r;
            temp=temp/10;
        }
        if(a==cube)
        System.out.println("Numbe is palindrome !!");
        else
        System.out.println("Numbe is not palindrome !!");
        
        
    }
    public static void check_prime(int a)
    {
        int flag=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("No is not prime");
        else
        System.out.println("no is prime");
    }
    public static void check_magic(int a)
    {
        if(a/10==0)
        {
            if(a%10==1)
            {
                System.out.println("Magic number");
            }
            else
            {
                System.out.println("not a magic no");
            }
            return ;
        }
        else
        {
            int temp=0;
            while(a>0)
            {
                int r= a%10;
                temp+=r;
                a/=10;
            }
            check_magic(temp);
        }
    }
    public static void check_perfect(int a)
    {
        int sum=1;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            sum=sum+i;
        }
        if(sum==a)
        System.out.println("No is perfect");
        else
        System.out.println("No is not perfect ");
    }
    public static void main(String []args)
    {
         Scanner s= new Scanner(System.in);
        System.out.println("Enter no ");
        int n= s.nextInt();
        int c;
        System.out.println("options :-");
        System.out.println(" 1. armstrong 2. Palindrome 3. Magic 4.Prime 5.perfect ");
        c= s.nextInt();
        switch(c)
        {
            case 1:check_armstrong(n);break;
            case 2: check_palindrome(n);break;
            case 3: check_magic(n);break;
            case 4: check_prime(n);break;
            case 5: check_perfect(n);break;
        }
    } 
}