package hello;
import  java.util.*;
public class date_time {
	public static void main(String args[]) {
		int day, mon, yr;
	    int sec, min, hr;
	    GregorianCalendar date = new GregorianCalendar();
	 
	    day = date.get(Calendar.DAY_OF_MONTH);
	    mon = date.get(Calendar.MONTH);
	    yr = date.get(Calendar.YEAR);
	    hr = date.get(Calendar.HOUR);
	    min = date.get(Calendar.MINUTE);
	    sec = date.get(Calendar.SECOND);
	    int am_pm = date.get(Calendar.WEEK_OF_YEAR);
	    
	    System.out.println("Today's date:  "+day+"/"+(mon+1)+"/"+yr);
	    System.out.println("Time is "+hr+":"+min+":"+sec+" "+am_pm);
	}
}
