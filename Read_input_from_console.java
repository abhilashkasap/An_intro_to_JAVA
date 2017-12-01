import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Read_input_from_console {

public static void main(String[] args) throws IOException
{
BufferedReader ob = new BufferedReader(new InputStreamReader(System.in)); 
String a= ob.readLine();
System.out.println(a);
//second method
System.out.println("second input using Scanner: ");
Scanner s =  new Scanner(System.in);
int b= s.nextInt();
System.out.println(b);
}
}
