import java.sql.*; // also with prepared statement
public class JDBC_CreateStatement {
public static void main(String[] args) throws Exception
{
	Class.forName("org.postgresql.Driver");
	Connection on = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","abhilash");
	Statement st = on.createStatement();
	ResultSet rs = st.executeQuery("select * from account");
	System.out.println(rs);
	while(rs.next())
	{
		System.out.println(rs.getString("acc_no")+" "+rs.getString("acc_name"));
	}
	PreparedStatement st1=on.prepareStatement("select * from account");
	ResultSet rs1= st1.executeQuery();
	while(rs1.next())
	{
		System.out.println(rs1.getString("acc_no")+" "+rs1.getString("acc_name"));
	}
}
}
