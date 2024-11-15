package exception_demo;

public class try_catch_demo_2 {

	public static void main(String[] args) {
	//try by changing order of catch block
		try {
		int a=10/0;
		
	} 
	catch (ArithmeticException e) {
		//
		
		//printing object
		System.out.println(e);
	}
	catch (Exception e) {
		//
		
		//printing object
		System.out.println(e);
	}
	catch (Throwable e) {
		//
		
		//printing object
		System.out.println(e);
	}
	
	
	}

}
