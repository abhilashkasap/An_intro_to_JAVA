class Detail
{
	String name;
	String address;
	String telno;
	double rent;
	Detail(String name,String address,String telno,double rent)
	{
		this.name=name;
		this.address=address;
		this.telno=telno;
		this.rent=rent;
	}
	void show()
	{
		System.out.println("Details of customer");
		System.out.println(name);
		System.out.println(address);
		System.out.println(telno);
		System.out.println(rent);
	}
}
class Bill extends Detail
{
	int n;
	double amt;
	Bill(String name,String address,String telno,double rent,int n)
	{
		super(name,address,telno,rent);
		this.n=n;
		this.amt=0.0;
		
		
	}
	void cal()
	{
		if(n<=100)
		{
			amt= rent;
		}
		else
			if(n>=101&&n<=200)
			{
				amt= rent+ (n*0.6);
			}
			else
				if(n>=201&&n<=300)
				{
					amt= rent+ (n*0.8);
					
				}
				else
				{
					amt= rent+ n;
				}
	}
	void show()
	{
		super.show();
		System.out.println("Showing amount to be paid");
		System.out.println(amt);
	}
}
public class InheritanceQ36 {
public static void main(String[] args)
{
	Bill ob = new Bill("Abhilash","Patna","9155523458",300,500);
	ob.show();
	ob.cal();
	ob.show();
	
}
}
