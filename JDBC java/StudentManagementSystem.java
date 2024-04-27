package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;



public class StudentManagementSystem {
  Connection connection;
  ResultSet rSet;
  CallableStatement sCallable;
  PreparedStatement pStatement;
  
  public StudentManagementSystem() throws ClassNotFoundException , SQLException
  {
	  connection = MyConnection.getMyConnection();
	  System.out.println("connection get created");
	  
  }
	
  public void insertDetails(int id, String name , float percentage , LocalDate DOB, String email, String phNo,String city) throws SQLException {
	  
	  sCallable = connection.prepareCall("{call  insert_student_details(? ,? ,? ,?,?,?,? )}");
	  sCallable.setInt(1, id);
	  sCallable.setString(2, name);
	  sCallable.setFloat(3, percentage);
	  sCallable.setObject(4, DOB);
	  sCallable.setString(5, email);
	  sCallable.setString(6, phNo);
	  sCallable.setString(7, city);
	  sCallable.execute();
	  System.out.println("Records are inserted");
	  
  }
	
  public void ViewAllStudent() throws SQLException {
	  
	  pStatement = connection.prepareStatement("select * from student_Deatails");
	  rSet = pStatement.executeQuery();
	  while(rSet.next())
      {
		 System.out.print(rSet.getInt(1)+ "\t");
		 System.out.print(rSet.getString(2)+ "\t");
		 System.out.print(rSet.getFloat(3)+ "\t");
		 System.out.print(rSet.getDate(4)+ "\t");
		 System.out.print(rSet.getString(5)+ "\t");
		 System.out.print(rSet.getString(6)+ "\t");
		 System.out.print(rSet.getString(7)+ "\t");
		 System.out.println();
		
	  }
	  
  }
  
  public void viewById(int id) throws SQLException {
	 
	  pStatement = connection.prepareStatement("select * from student_Details where rollNo = ? ");
	  pStatement.setInt(1, id);
	  rSet = pStatement.executeQuery();
	  while(rSet.next())
      {
		 System.out.print(rSet.getInt(1)+ "\t");
		 System.out.print(rSet.getString(2)+ "\t");
		 System.out.print(rSet.getFloat(3)+ "\t");
		 System.out.print(rSet.getDate(4)+ "\t");
		 System.out.print(rSet.getString(5)+ "\t");
		 System.out.print(rSet.getString(6)+ "\t");
		 System.out.print(rSet.getString(7)+ "\t");
		 System.out.println();
		
	  }
	  
	  
  }
  
  public void viewByCity(String city) throws SQLException {
		 
	  pStatement = connection.prepareStatement("select * from student_Details where city = ? ");
	  pStatement.setString(1, city);
	  rSet = pStatement.executeQuery();
	  while(rSet.next())
      {
		 System.out.print(rSet.getInt(1)+ "\t");
		 System.out.print(rSet.getString(2)+ "\t");
		 System.out.print(rSet.getFloat(3)+ "\t");
		 System.out.print(rSet.getDate(4)+ "\t");
		 System.out.print(rSet.getString(5)+ "\t");
		 System.out.print(rSet.getString(6)+ "\t");
		 System.out.print(rSet.getString(7)+ "\t");
		 System.out.println();
		
	  }
	  
	  
  }
  
  public void viewByPercentage(float min,float max) throws SQLException {
		 
	  pStatement = connection.prepareStatement("select * from student_Details where percentage between ? and ? ");
	  pStatement.setFloat(1, min);
	  pStatement.setFloat(2, max);
	  rSet = pStatement.executeQuery();
	  while(rSet.next())
      {
		 System.out.print(rSet.getInt(1)+ "\t");
		 System.out.print(rSet.getString(2)+ "\t");
		 System.out.print(rSet.getFloat(3)+ "\t");
		 System.out.print(rSet.getDate(4)+ "\t");
		 System.out.print(rSet.getString(5)+ "\t");
		 System.out.print(rSet.getString(6)+ "\t");
		 System.out.print(rSet.getString(7)+ "\t");
		 System.out.println();
		
	  }
	  
	  
  }
  public void updateStudent(int id, String name , float percentage , LocalDate DOB, String email, String phNo,String city) throws SQLException {
		 
	  pStatement = connection.prepareStatement("update student_details set name = ?,percentage = ?,DOB =?,email = ?,phNo = ?,city =? where rollNo =?");
	  pStatement.setString(1, name);
	  pStatement.setFloat(2,percentage );
	  pStatement.setObject(3, DOB);
	  pStatement.setString(4, email);
	  pStatement.setString(5, phNo);
	  pStatement.setString(6, city);
	  pStatement.setInt(7, id);
	  
	  int n = pStatement.executeUpdate();
	  System.out.println(n+ " Record updated..");
  }
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
         StudentManagementSystem  obj = new StudentManagementSystem();
          
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your Choice");
         System.out.println("1.insert student details(create a procedure)\r\n"
         		+ "2.view all student details\r\n"
         		+ "3.view student details on the basis of rolllno\r\n"
         		+ "4.search student by city name\r\n"
         		+ "5.view all student details in the range of min and max \r\n"
         		+ "");
        
         int choice = scanner.nextInt();
         
         switch (choice) {
		case 1:
			 System.out.println("Enter Roll no. ");
			 int rollNo = scanner.nextInt();
			 scanner.nextLine();
			 
			 System.out.println("Enter Name :");
			 String name = scanner.nextLine();
			 
			 System.out.println("Enter Percentage :");
			 float percentage = scanner.nextFloat();
			 
			 System.out.println("Enter DOB (YYYY-MM-DD) : ");
			 String DOB = scanner.nextLine();
			 
			 System.out.println("Enter email");
			 String email = scanner.nextLine();
			 
			 System.out.println("Enter Phone No. :");
			 String phNo = scanner.nextLine();
			 
			 System.out.println("Enter City :");
			 String city = scanner.nextLine();

			 
			 
			 obj.insertDetails(rollNo ,name, percentage, LocalDate.parse(DOB),email,phNo,city);
			
			break;
		case 2 :
			obj.ViewAllStudent();
			break;
		
		case 3 :
			System.out.println("Enter Roll  number to search record :");
			rollNo = scanner.nextInt();
			obj.viewById(rollNo);
			
			break;
		
		case 4 :	
			System.out.println("Enter City name to search record :");
			city = scanner.nextLine();
			obj.viewByCity(city);
			break;
			
		case 5 :
			System.out.println("Enter MIN and MAX range of percentage to search record :");
			float min = scanner.nextFloat();
			float max = scanner.nextFloat();
			obj.viewByPercentage(min,max);
			break;
		case 6 :
			 System.out.println("Enter Roll no. ");
			 rollNo = scanner.nextInt();
			 scanner.nextLine();
			 
			 System.out.println("Enter Name :");
			 name = scanner.nextLine();
			 
			 System.out.println("Enter Percentage :");
			 percentage = scanner.nextFloat();
			 
			 System.out.println("Enter DOB (YYYY-MM-DD) : ");
			 DOB = scanner.nextLine();
			 
			 System.out.println("Enter email");
		     email = scanner.nextLine();
			 
			 System.out.println("Enter Phone No. :");
			 phNo = scanner.nextLine();
			 
			 System.out.println("Enter City :");
			 city = scanner.nextLine();
			 
			 obj.updateStudent(rollNo, name, percentage, LocalDate.parse(DOB), email, phNo, city);
			break;
			
			

		default:
			break;
		}
         

	}

}
//select * from student details where percentage = (select max (percentage) from student_details);
