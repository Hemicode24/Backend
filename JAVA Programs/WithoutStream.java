package java8features;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Sanika");
		list.add("Ajay");
		list.add("Saloni");
		list.add("Manas");
		
		int count = 0;
		
		for (String string : list) {
			if(string.length()<5)
			{
				count++;
			}
		}
		
		System.out.println("There are "+count+" with length less than 5");
	}

}
