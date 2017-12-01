import java.io.*;
public class Basic_File_operations {
public static void main(String[] args) throws Exception
{
	File file= new File("C:/Users");
	System.out.println(file.isDirectory());
	String[] temp= file.list();
	for(int i=0;i<temp.length;i++)
	{
		System.out.println(temp[i]);
	}
}
}
