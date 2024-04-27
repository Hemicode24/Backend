package java8features;

import java.util.ArrayList;
import java.util.List;

public class Student {

	int id,age;
	String name;
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public static List<Student> getStudents()
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, 25, "Raj"));
		list.add(new Student(102, 20, "Riya"));
		list.add(new Student(103, 32, "Shubhendu"));
		list.add(new Student(104, 45, "Pankaj"));
		list.add(new Student(105, 26, "Yuvraj"));
		
		return list;
	}
}
