
public class SawpVariables {

	public static void main(String[] args) {
		
		float first = 1.20f;
		float second = 2.45f;
		
		System.out.println("------------Before Swap--------------------");
		System.out.println("first number = " + first);
		System.out.println("second number = " + second);
		
		float temporary = first;
		first = second;
		second = temporary;
		
		System.out.println("--------------After Swap--------------------");
		System.out.println("first number = " + first);
		System.out.println("second number = " + second);

	}

}
