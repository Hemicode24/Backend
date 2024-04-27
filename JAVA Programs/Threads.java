package thread;


class Test implements Runnable   {

 int a = 10;
 int b =  20;
 
 void add() {
	 
	 System.out.println(a + b);
 }
 
 void sub() {
	 System.out.println(a - b);
 }
 
 void multi() {
	 
	 System.out.println(a * b);
 }
 
 void div() {
	 System.out.println(a / b);
 }
 
		
}


	
	

public class Threads {

	public static void main(String[] args) {
		Test t = new Test();

		Runnable t1 =   ()->{
			t.add();
			   
		};
		
		Runnable t2 =  () -> {
			
			t.sub();
		};
		
		Runnable t3 = ()->{
			t.multi();
		};
		
		
		Runnable t4 = () ->{
			
			t.div();
		};
		
		Thread thread1 = new Thread(t1);
		((Thread) t1).start();
	}

}
