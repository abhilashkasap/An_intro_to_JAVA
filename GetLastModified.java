import java.io.*;
public class GetLastModified {
public static void main(String[] args)
{
	File file= new File("C:/Users");
	System.out.println(file.lastModified());
}
}
