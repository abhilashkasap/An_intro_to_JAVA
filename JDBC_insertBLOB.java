import java.io.*;
import java.sql.*;
public class JDBC_insertBLOB {
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection on = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","abhilash");
		File file = new File("C:/Users/LENOVO/Desktop/java_lab_22_aug/List2/src/SHUBHAM_PHOTO.jpg");
		FileInputStream fis = new FileInputStream(file);
		PreparedStatement ps = on.prepareStatement("INSERT INTO account VALUES ('13', 'shubham',?)");
	
		ps.setBinaryStream(1, fis, file.length());
		ps.executeUpdate();
		ps.close();
		fis.close();
		System.out.println("done !!");
		
		
	}
}
