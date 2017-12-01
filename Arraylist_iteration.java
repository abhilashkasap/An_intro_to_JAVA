import java.util.*; //shuffle 
public class Arraylist_iteration {
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	//int p;
	al.add("Abhilash");
	al.add(Integer.valueOf(15));
	al.add("rajarshi");
	al.add(Integer.valueOf(25));
	System.out.println(al);
	
	Collections.shuffle(al);
	System.out.println(al);
	
}
}
