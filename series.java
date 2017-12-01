import java.util.*;
class series
{
    public static void main(String []args)
    {
        int n;
        Scanner s= new Scanner(System.in);
        n= s.nextInt();
        int sum=0;
        int temp=12;
        for(int i=1;i<=n;i++)
        {
           // System.out.println(temp);
           sum+=temp;
            temp+=10;
        }
        System.out.println(sum);
        temp=1;
        sum=0;
        for(int i=1;i<=n;i++)
        {  if(i%2==0)
            sum=sum-temp;
            else
            sum+=temp;
            
            temp++;
        }
        System.out.println(sum);
        double sum1=0;double num=2;double de=9;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            sum1=sum1-(num/de);
            else
            sum1=sum1+(num/de);
            num=num+3;
            de=de+4;
        }
        System.out.println(sum1);
        
    }
}