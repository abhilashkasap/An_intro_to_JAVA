class mythread extends Thread
{
	public void run()
	{   for(int i=0;i<100;i++)
		System.out.println("mythread class new thread");
	}
}
class mythread2 extends Thread
{
	public void run()
	{  for(int i=0;i<100;i++)
		System.out.println("mythread2 class new thread");
	}
}
public class Java_Thread_joinsQ7 {
	public static void main(String[] args)
	{
		mythread t1= new mythread();
		mythread2 t2=new mythread2();
		t1.start();
		
		try
		{
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		System.out.println("Main Thread");
	}

}
