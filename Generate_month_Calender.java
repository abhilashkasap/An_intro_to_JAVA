package hello;
import java.util.Scanner;
public class Generate_month_Calender {
	public static String nex_day(String day)
	{
		if(day.equalsIgnoreCase("monday"))
			return "tuesday";
		else
			if(day.equalsIgnoreCase("tuesday"))
				return "wednesday";
			else
				if(day.equalsIgnoreCase("wednesday"))
					return "thursday";
				else
					if(day.equalsIgnoreCase("thursday"))
						return "friday";
					else
						if(day.equalsIgnoreCase("friday"))
							return "saturday";
						else
							if(day.equalsIgnoreCase("saturday"))
								return "sunday";
							else
								return "monday";
						
					
			}
	public static int return_days_no_leap(int month)
	{
		switch(month)
		{
		case 1: return 31; 
		case 2:return 28 ; 
		case 3: return 31; 
		case 4: return 30 ; 
		case 5: return 31 ; 
		case 6: return 30; 
		case 7: return 31;
		case 8: return 31;
		case 9: return 30; 
		case 10:return 31;
		case 11:return 30 ; 
		case 12:return 31; 
		default:return 30;
		
		}
	}
	public static int return_days_leap(int month)
	{
		switch(month)
		{
		case 1: return 31; 
		case 2:return 28 ; 
		case 3: return 31; 
		case 4: return 30 ; 
		case 5: return 31 ; 
		case 6: return 30; 
		case 7: return 31;
		case 8: return 31;
		case 9: return 30; 
		case 10:return 31;
		case 11:return 30 ; 
		case 12:return 31; 
		default:return 30;
		
		}
	}
public static void main(String[] args)
{   Scanner s = new Scanner(System.in);
	String first= s.nextLine();
	int month;
	int year;
	month=  s.nextInt();
	year=s.nextInt();
	int days;
	if(year%4==0)
		days= return_days_leap(month);
	else
		days= return_days_no_leap(month);
	String temp=first;
	for(int i=1;i<=days;i++)
	{   
		if(i==1)
		{
			System.out.println(i+ " " + first);
			
		}
		else
		{
			System.out.println(i+ " " + nex_day(temp));
			temp=nex_day(temp);
		}
		
	}
	
	
}
}
