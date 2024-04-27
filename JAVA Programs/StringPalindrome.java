package stringex;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();		//str=madam
		
		boolean b = isPalindrome(str);
		
		if(b==true)
			System.out.println("Palindrome");
		else
			System.out.println("not Palindrome");
		
	}
		
		public static boolean isPalindrome(String str) //str=madam
		{
			int length = str.length();		//length=5
			
			for(int i=0; i<length/2;i++)
			{
				if(str.charAt(i) != str.charAt(length-i-1))
					return false;
			}
			
			return true;
		}
		
	

}
