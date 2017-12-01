import java.io.*;
public class GetAllfileObjects {
public static void main(String[] args)
{
	File file= new File("C:/Users/LENOVO/Desktop/");
	File[] files = file.listFiles();
	for(int i=0;i<files.length;i++)
		System.out.println(files[i]);
}
}
