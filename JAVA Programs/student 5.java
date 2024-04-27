package stringex;

public class Student implements Cloneable {

	int id,age;
	String name;
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(101, 20, "Raj");
		Student s2 = new Student(102, 22, "Riya");
		Student s3 = (Student) s2.clone();
		
		
		System.out.println(s1);	//compiler will call toString()
		System.out.println(s2);
		System.out.println(s3);
	}
	
}
