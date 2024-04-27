package oopsPrograms;

import java.util.Scanner;

public class Students extends Person{
	
	int rollNo;
	int javaMarks;
	int pythonMarks;
	int phpMarks;
	int totalMarks;
	
	public void readStudentDetails() {
		Scanner scanner = new Scanner(System.in);
		rollNo = scanner.nextInt();
		javaMarks = scanner.nextInt();
		pythonMarks = scanner.nextInt();
		phpMarks = scanner.nextInt();
		
	}

	public Students(int rollNo, int javaMarks, int pythonMarks, int phpMarks, int totalMarks) {
		super();
		this.rollNo = rollNo;
		this.javaMarks = javaMarks;
		this.pythonMarks = pythonMarks;
		this.phpMarks = phpMarks;
		this.totalMarks = totalMarks;
	}
	
	Students(){
	//	super();
		//System.out.println("This is Students constructor");
	}
	
	
	
	public void total() {
		
		totalMarks = javaMarks + pythonMarks + phpMarks;
	}
	
	public String toString() {
		
		return "Roll No. - " + rollNo + "\nName - " + name +
				"\nAge - " + age + "\nCity - " + city +
				"\nJava Marks - " + javaMarks + "\nPython Marks - " + pythonMarks +
				"\nPhp Marks - " + phpMarks + "\nTotal Marks - " + totalMarks;
				
	}

}
