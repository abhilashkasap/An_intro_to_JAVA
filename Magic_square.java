package hello;
import java.util.Scanner;
public class Magic_square
{
    public static void main(String args[])
    {    Scanner s = new Scanner(System.in);
        
        System.out.print("\n\nEnter the size of the matrix : ");
        int n=s.nextInt();

        if(n>5)
         System.out.println("Enter a number between 1 to 5 ");

        else
        {
        int A[][]=new int[n][n]; 
        int i,j,k,t;
         
        /*Initializing every cell of the matrix with 0 */
        for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    {
                        A[i][j] = 0;
                    }
            }

        /* When the size of the matrix is Odd */
        if(n%2!=0)
        {
            i=0; 
            j = n/2;
            k = 1;
            while(k<=n*n)
            {
                A[i][j] = k++;
                i--; 
                j++; 
                if(i<0 && j>n-1) 
                {
                    i = i+2;
                    j--;
                }

                if(i<0) 
                    i = n-1;

                if(j>n-1)
                    j = 0;

                if(A[i][j]>0) 
                {
                    i = i+2;
                    j--;
                }
            }
        }
        else
        {
            k = 1;
             
            
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    {
                        A[i][j] = k++;
                    }
            }
             
            j = n-1;
             
            for(i=0; i<n/2; i++)
            {
               
                t = A[i][i];
                A[i][i] = A[j][j];
                A[j][j] = t;
                t = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = t;
                 j--;
            }
        }
        System.out.println("The Magic Matrix of size "+n+"x"+n+" is:");
        for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    {
                        System.out.print(A[i][j]+ "\t");
                    }
             System.out.println();
            }
     }
    }
}
