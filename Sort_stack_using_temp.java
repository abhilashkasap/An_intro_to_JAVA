package hello;
import java.util.Scanner;
public class Sort_stack_using_temp {
static int stack1[]=new int[100];
static int stack2[]=new int[100];
static int top1=-1;
static int top3=-1;


public static void main(String []args)
{
Scanner s= new Scanner(System.in);
for(int i=1;i<=5;i++)
{
	int temp= s.nextInt();
	stack1[++top1]=temp;
	
}

int size=5; int j=-1;
//System.out.println(top1+" "+top3);
for(int i=0;i<size;i++)
{
	while(top1!=j)
	{
		if(top3==-1)
		{
			stack2[++top3]=stack1[top1--];
			
		}
		else
		{
			if(stack1[top1]<stack2[top3])
			{
				stack2[++top3]=stack1[top1--];
			}
			else
			{
				int temp = stack2[top3--];
				stack2[++top3]=stack1[top1--];
				stack2[++top3]=temp;
				
			}
		}
	}
	j++;
	while(top3!=-1)
	{
		stack1[++top1]=stack2[top3--];
	}
	
}
for(int i=0;i<5;i++)
	System.out.println(stack1[i]);
	
}

}
