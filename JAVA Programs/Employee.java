package oopsPrograms;

import java.util.Scanner;

public class Employee extends Person{
	
	int employeeId;
	String departmentName;
	double salary;
	
	public void ReadEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		employeeId = scanner.nextInt();
		departmentName = scanner.next();
		salary = scanner.nextDouble();
	}

	public Employee(int employeeId, String departmentName, double salary) {
		super();
		this.employeeId = employeeId;
		this.departmentName = departmentName;
		this.salary = salary;
	}
	
	Employee(){
		
		System.out.println("This is employee constructor");
		
	}

}
