package hello;
import java.util.*;
public class check_same_line {
public static void check_single_line(double x1,double x2,double x3,double y1,double y2,double y3)
{
	double slope= (y2-y1)/(x2-x1);
	double lhs= y3-y1;
	double rhs= slope*(x3-x1);
	if(lhs==rhs)
		System.out.println("Lying on a same line");
	else
		System.out.println("Doesn't lie on same line");
}
public static void main(String []args)
{
	double x1,x2,x3,y1,y2,y3;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter in following seq (x1,x2,x3,y1,y2,y3)");
	
	x1= s.nextDouble();
	x2= s.nextDouble();
	x3=s.nextDouble();
	y1=s.nextDouble();
	y2=s.nextDouble();
	y3=s.nextDouble();
	check_single_line(x1,x2,x3,y1,y2,y3);
}
}
