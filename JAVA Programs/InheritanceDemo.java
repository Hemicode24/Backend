package oopsPrograms;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Students stu = new Students();
		Employee employee = new Employee();
		
		stu.readPersonDetails();
		stu.readStudentDetails();
		stu.total();
		
		System.out.println(stu);
	}

}
