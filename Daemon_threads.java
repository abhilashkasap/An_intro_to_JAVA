class testdaemon extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("It is a Daemon Thread");
		}
		else
		{
			System.out.println("It is not a Daemon Thread ");
		}
	}
}
public class Daemon_threads {
	public static void main(String[] args)
	{
		testdaemon t1= new testdaemon();
		testdaemon t2= new testdaemon();
		t2.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println("Executing Main Thread !!");
	}

}
