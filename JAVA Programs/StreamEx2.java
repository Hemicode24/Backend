package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Annie","Shubhendu","Saranya","Shubhakanta","Vyankatesh","Raj","Ajay");
		
		List<String> longNames = names.stream().filter(str -> str.length()>6 && str.length()<10).collect(Collectors.toList());
		
		//longNames.forEach(str -> System.out.println(str));
		longNames.forEach(System.out::println);
		
	}
}
