class Generic<U, V>
{
	public U first;
	public V second;
	public Generic(U first,V second)
	{
		this.first=first;
		this.second=second;
	}
	public String toString()
	{
		System.out.print("First Value Class: "+first.getClass().getName());
		System.out.print("Second Value Class: "+second.getClass().getName());
		return "ok";
	}
}
public class Simple_generics_two_params {
public static void main(String[] args)
{
	Generic<String, Integer> so= new Generic<String, Integer>("Abhilash",15);
	System.out.println(so);
}
}
