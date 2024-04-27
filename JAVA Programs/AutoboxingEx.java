package stringex;

public class AutoboxingEx {

	public static void main(String[] args) {
		int a = 10;
		Integer i = a;	//Autoboxing, compiler will write Integer.valueOf(a);
		Integer j = Integer.valueOf(a);  //before Java5
		
		System.out.println(a+" "+i+" "+j);
		
		Integer x = new Integer(20);
		int y = x;	//Unboxing, compiler will write x.intValue()
		int z = x.intValue();	//before Java5
		
		System.out.println(x+" "+y+" "+z);
	}
}
