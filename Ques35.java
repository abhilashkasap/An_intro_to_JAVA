import java.util.Scanner;
class Record
{
	String name[]=new String[50];
	int rank[]=new int[50];
	Record()
	{
		for(int i=0;i<50;i++)
			{rank[i]=0;
			 name[i]=null;
			}
	}
	void readvalues()
	{   Scanner s = new Scanner(System.in);
	
		System.out.println("input 50 values");
		int r;
		String n;
		for(int i=0;i<50;i++)
		{
			r= s.nextInt();
			n= s.nextLine();
			rank[i]=r;
			name[i]=n;
		}
		
	}
	void display()
	{
		System.out.println("Displaying Values");
		for(int i=0;i<50;i++)
		{
		  System.out.print("Name :" + name[i]);
		  System.out.print("Rank :" + rank[i]);
		  System.out.println();
		}
	}
}
class Rank extends Record
{
	int index;
	Rank()
	{
		super();
		index=0;
	}
	public void highest()
	{
		for(int i=0;i<50;i++)
		{
			if(rank[i]<rank[index])
			{
			index=i;	
			}
		}
	}
	public void display()
	{
		super.display();
		System.out.println("Topper's rank and name is :");
		System.out.println("Name :"+name[index]);
		System.out.println("Rank :"+rank[index]);
	}
}
public class Ques35 {
public static void main(String[] args)
{
	Rank ob =new Rank();
	ob.readvalues();
	ob.highest();
}
}
