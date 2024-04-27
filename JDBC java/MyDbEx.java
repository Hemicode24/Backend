package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDbEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//register driver
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mornbatch", "root", "password");
		
		//create statement
		Statement statement = con.createStatement();
		
		//execute statement
		ResultSet reSet = statement.executeQuery("select * from contact_details");
		
		//retrieve result
		while(reSet.next())
		{
			System.out.print(reSet.getInt("contact_id") + "\t");
			System.out.print(reSet.getString("person_name") + "\t");
			System.out.print(reSet.getString("phone_no") + "\t");
			System.out.println();
		}
		
		//close connection
		statement.close();
		con.close();
	}

}
