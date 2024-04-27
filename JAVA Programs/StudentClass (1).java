// To read and print 3 employees' records


import java.util.Scanner;

 class Student {
	
	 private int rollNo;  // private
     private String name;
	 private int javaMarks; // 50
	 private int pythonMarks;
	 private int phpMarks;
	 private int totalMarks;
	 
	
	Student(){
		javaMarks = 50;
		pythonMarks = 35;
		phpMarks = 30;
	}
	
	Student(int rollNo, String name, int java, int python, int php){
		this.rollNo = rollNo;
		this.name = name;
		this.javaMarks = java;
		this.pythonMarks = python;
		this.phpMarks = php;

		// this - for current object
		
	}
	
	void totalMarks() {
		
		totalMarks = javaMarks  +  pythonMarks + phpMarks;
		
	}
	
	public void insertValue() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Roll No.");
		rollNo = scanner.nextInt();
		System.out.println("Enter Name");
        name = scanner.next();
		System.out.println("Enter Java Marks");
	    javaMarks = scanner.nextInt();
		System.out.println("Enter Python Marks");
		pythonMarks = scanner.nextInt();
		System.out.println("Enter Php Marks");
		phpMarks = scanner.nextInt();


	}
	
	
  public String toString(){
	return "Roll No. " + rollNo + "\n Name " + name + "\n Java Marks " + 
            javaMarks + "\n Python Marks" + pythonMarks + "\n Php Marks " + 
			phpMarks + "\n Total Marks " + totalMarks;
	  
  }
}

public class StudentClass{
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		System.out.println("Enter Roll No.");
		int rollNo = scanner.nextInt();
		System.out.println("Enter Name");
        String name = scanner.next();
		System.out.println("Enter Java Marks");
	    int javaMarks = scanner.nextInt();
		System.out.println("Enter Python Marks");
		int pythonMarks = scanner.nextInt();
		System.out.println("Enter Php Marks");
		int phpMarks = scanner.nextInt();
		
		
		Student s1 = new Student(rollNo, name , javaMarks, pythonMarks, phpMarks );


		//s1.insertValue();
        s1.totalMarks();

	System.out.println(s1);
	//System.out.println(s2.toString());

	
	//System.out.println(s3);

	//System.out.println(s4);

		
		
		
	}

}
