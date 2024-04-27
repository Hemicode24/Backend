package oopsPrograms;

import java.util.Scanner;

public class Person {
	
	String name;
	int age;
	String city;
	
	public void readPersonDetails() {
		
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		age = scanner.nextInt();
		city = scanner.next();
		}

	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Person() {
		//System.out.println("This is Person constructor");
	}
	
	
	

}
