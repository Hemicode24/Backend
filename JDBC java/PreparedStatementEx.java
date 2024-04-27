package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {
	
	Connection connection;
	PreparedStatement pStatement;
	ResultSet rSet;
	
	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void getDataBySalary(float min,float max) throws SQLException
	{
	
		pStatement = connection.prepareStatement("select * from employee where salary between ? and ?");
		pStatement.setFloat(1, min);
		pStatement.setFloat(2, max);
		rSet = pStatement.executeQuery(); //DRL
		
		while(rSet.next())
		{
			System.out.print(rSet.getInt(1) +"\t");
			System.out.print(rSet.getString(2)+"\t");
			System.out.print(rSet.getFloat(3)+"\t");
			System.out.print(rSet.getDate(4)+"\t");
			System.out.print(rSet.getString(5)+"\t");
			System.out.print(rSet.getString(6)+"\t");
			System.out.println();
		}
	}
	
	public void insertRecord(int id,String name,String addr,String phoneNo) throws SQLException
	{
		pStatement = connection.prepareStatement("insert into customer values(?,?,?,?)");
		pStatement.setInt(1, id);
		pStatement.setString(2, name);
		pStatement.setString(3, addr);
		pStatement.setString(4, phoneNo);
		int n = pStatement.executeUpdate();  //DML
		System.out.println(n + " record is inserted");
	}

	public void updateCust(int id,String phoneNo) throws SQLException
	{
		pStatement = connection.prepareStatement("update customer set phone_no = ? where c_id = ?");
		pStatement.setString(1, phoneNo);
		pStatement.setInt(2, id);
		int n = pStatement.executeUpdate();
		System.out.println(n +" record is updated");
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min and max range of salary : ");
		float min = sc.nextFloat();
		float max = sc.nextFloat();
		
		PreparedStatementEx p1 = new PreparedStatementEx();
		p1.getDataBySalary(min, max);
		//p1.insertRecord(107,"Rohit", "Pune", "90111887775");
		
		System.out.println("Enter customer id and phone number : ");
		int cId = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		p1.updateCust(cId, name);
	}

}
