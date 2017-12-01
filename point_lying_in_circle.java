package hello;
import java.util.*;
public class point_lying_in_circle {
public static void check_inside(double x1,double y1,double r,double cx,double cy)
{
	double distance = ((cx-x1)*(cx-x1))+((cy-y1)*(cy-y1));
	distance = Math.sqrt(distance);
	if(r>=distance)
		System.out.println("Given point is inside the circle");
	else
		System.out.println("Given point is not inside the circle");
	
}
public static void main(String []args)
{
	Scanner s= new Scanner(System.in);
	double r,cx,cy,x1,y1;
	System.out.println("Enter Values of r,cx,cy,x1,y1");
	r= s.nextDouble();
	cx=s.nextDouble();
	cy=s.nextDouble();
	x1=s.nextDouble();
	y1=s.nextDouble();
	check_inside(x1,y1,r,cx,cy);
	
}
}
