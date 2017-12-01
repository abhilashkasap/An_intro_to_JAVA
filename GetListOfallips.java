import java.net.*;
public class GetListOfallips {
public static void main(String[] args) throws Exception
{
	InetAddress[] addr = InetAddress.getAllByName("www.google.com");
	for(int i=0;i<addr.length;i++)
	{
		System.out.println(addr[i]);
	}
}
}
