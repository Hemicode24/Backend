package java8features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Student> p1 = s -> s.name.startsWith("X");
		Predicate<Student> p2 = s -> s.age<40 && s.name.startsWith("R");
		Predicate<Student> p3 = s -> s.age<50;
		
		List<Student> list = Student.getStudents();
		
		boolean b1 = list.stream().anyMatch(p1);
		System.out.println("Predicate p1 with anyMatch() : "+b1);
		
		boolean b2 = list.stream().noneMatch(p1);
		System.out.println("Predicate p1 with noneMatch() : "+b2);
		
		boolean b3 = list.stream().noneMatch(p2);
		System.out.println("Predicate p2 with noneMatch() : "+b3);
		
		boolean b4 = list.stream().allMatch(p3);
		System.out.println("Predicate p1 with noneMatch() : "+b4);
	}

}
