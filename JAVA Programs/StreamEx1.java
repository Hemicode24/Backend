package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = Arrays.asList("Annie","Shubhendu","Saranya","Shubhakanta","Vyankatesh","Raj","Ajay");
		
		//creating stream
		Stream<String> allNames = names.stream();	//creating a stream
	
		//perform intermediate operation
		Stream<String> longNames = allNames.filter(str -> str.length()>7); //retrieving strings with length>7
		
		//perform terminal operation
		longNames.forEach(str -> System.out.print(str+" "));	//printing long names
	}

}
