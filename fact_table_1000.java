class fact_table_1000
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
   for(int k=1;k<=5;k++)
   {
        System.out.println("Factorial of given n = "+ fact(k));
       for(int i=1;i<=10;i++)
       {
          int temp= k*i;
          System.out.println(temp);

       }
    }
    }
}