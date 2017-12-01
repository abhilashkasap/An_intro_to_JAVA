class parent44
{
	int a=10;
	parent44()
	{
		System.out.println("Parent Class Constructor Called");
	}
}
class child44 extends parent44
{
	child44()
	{
		System.out.println("child class constructor called");
	}
}
public class Object_creation_of_inheritedClass {
public static void main(String[] args)
{
	parent44 ob= new parent44();
	System.out.println("Parent Class object created");
	child44 ob1 = new child44();
	System.out.println("Child Class object created");
}
}
