
public class Method_overloading33a {
	int a=15;
	int b=70;
public void fun(int c,int d)
{
	a=c;
	b=d;
	System.out.println("Result a="+a+" b ="+b);
}
public void fun(int c)
{
	System.out.println("Received value ="+c);
}
public void fun()
{
	System.out.println("Overloaded Function");
}
public static void main(String[] args)
{   
	Method_overloading33a ob= new Method_overloading33a();
	ob.fun();
	ob.fun(5);
	ob.fun(10,15);
}
}
