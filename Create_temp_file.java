import java.io.*;
public class Create_temp_file {
public static void main(String[] args) throws Exception
{
	File temp= File.createTempFile("mytemp", ".tmp");
	FileWriter f = new FileWriter(temp);
	f.write("Hi Go ahead for write");
	f.close();
	System.out.println("done !!");
	File nfile= new File("D:/Myfile.txt");
    if(!nfile.exists())
    {
    	nfile.createNewFile();
    }
    	
    FileWriter fn = new FileWriter(nfile);
    fn.write("Hi YOu are good \n");
    fn.append('\n');
    fn.write("Ok done");
    fn.write("\n Done with lines");
    fn.close();
    BufferedWriter b = new BufferedWriter(new FileWriter(nfile));
    b.write("ok");
    b.newLine();
    b.write("New line Text");
   
    
}
}
