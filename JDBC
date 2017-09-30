import java.util.*;
import java.sql.*;
class jdbc
{
	public static void main(String args[])

	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  //use to load the driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","username","password");
			Statement s = con.createStatement();
			ResultSet res = s.executeQuery("select * from student");
			while(res.next())
			{
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			con.close();

		}
		catch(Exception e)
		{
			e.printStacktrace();

		}
	}
}
