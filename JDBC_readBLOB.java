import java.io.*;
import java.sql.*;
public class JDBC_readBLOB {
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver");
		Connection on = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","abhilash");
		
		PreparedStatement ps = on.prepareStatement("select pic from account where acc_no='13'");
	    byte[] imgBytes = new byte[1034];
		
		ResultSet rs = ps.executeQuery();
		if (rs != null) {
		    while (rs.next()) {
		        imgBytes= rs.getBytes(1);
		        
		    }
		    rs.close();
		}
		ps.close();
		FileOutputStream fs = new FileOutputStream("myfile.jpg");
		//int size = 0;
        fs.write(imgBytes);
		System.out.println("Done");
	}
}
