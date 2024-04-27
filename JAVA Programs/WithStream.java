package java8features;

import java.util.ArrayList;

public class WithStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Sanika");
		list.add("Ajay");
		list.add("Saloni");
		list.add("Manas");
		
		long count = list.stream().filter(str -> str.length()<5).count();
		
		System.out.println("There are "+count+" string with length less than 5");
	}

}
