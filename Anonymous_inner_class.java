abstract class test37
{
	abstract public void show();
}
abstract class Anonymous_inner_class extends test37
{
	public static void main(String[] args)
	{
		Anonymous_inner_class ob =new Anonymous_inner_class()
		{
			public void show()
			{
				System.out.println("hello");
			}
		};
		
		ob.show();
		System.out.println(ob.getClass());
		
	}
}