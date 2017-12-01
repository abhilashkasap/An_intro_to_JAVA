package hello;
import java.util.*;
public class quad_roots {
public static void root_finder(int a,int b,int c)
{
	double d = (b*b)-(4*a*c);
	d= Math.sqrt(d);
	double root1,root2;
	root1= (-b+d)/(2*a);
	root2= (-b-d)/(2*a);
	System.out.println("Root 1 = "+root1);
	System.out.println("Root 2 = "+root2);
}
public static void main(String []args)
{
	int a,b,c;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter values of a ,b,c");
	a= s.nextInt();
	b= s.nextInt();
	c= s.nextInt();
	root_finder(a,b,c);
}
}
