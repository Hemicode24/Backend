package ArithmaticApp;

public class ArithmaticImpl implements ArithmaticInterface {

	@Override
	public void add(int a, int b) {
		
		System.out.println(a + b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		
		System.out.println(a - b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		
		System.out.println(a * b);
	}

	@Override
	public void division(int a, int b) {
		
		System.out.println(a / b);
	}

}
