import java.util.*;
public class Iterate_through_ArrayList {
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	al.add("abhilash");
	al.add(Integer.valueOf(35));
	al.add("Go goa gone");
	Iterator i= al.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
