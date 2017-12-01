import java.net.*;
public class GetLocalHostAddr {
public static void main(String[] args) throws Exception
{
	InetAddress addr = InetAddress.getLocalHost();
	InetAddress addr1 = InetAddress.getLoopbackAddress();
	System.out.println(addr);
	System.out.println(addr1);
}
}
