package hello;

public class Insertion_sort {
public static void insertion_sort(int a[])
{
	int size= a.length;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i;j>0;j--)
		{
			if(a[j]<a[j-1])
			{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
}
public static void main(String[] args)
{
	//Scanner s= new Scanner(System.in);
	int a[]={15,12,1,158,36};
	insertion_sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
