import java.util.*;
public class Remove_element_Collections {
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	al.add("Hi");
	al.add("Second");
	al.add("Third");
	al.add("Fourth");
	al.add("Five");
	String temp="Third";
	Iterator i = al.iterator();
	while(i.hasNext())
	{
		if(i.next()== temp)
			i.remove();
	}
	Iterator i1 = al.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
}
}
