package stringex;

public class StringMethodEx {

	public static void main(String[] args) {
		
		String s1="Welcome", s2="Hello ", s3="welcome", s4="     Welcome to EduBridge       ";
		
		System.out.println("chatAt(3) : "+s1.charAt(3));
		
		System.out.println(s1.contains("x"));
		
		s4 = s4.trim();
		
		String splitedString[] = s4.split(" ");
		
		System.out.println("Splited strings : ");
		for(int i=0;i<splitedString.length;i++)
		{
			System.out.println(splitedString[i]);
		}
		
		StringBuffer buffer = new StringBuffer("Welcome ");
		System.out.println(buffer);
		buffer.append("to EduBridge");
		System.out.println(buffer);
		
	
	}
	
}
