package exception_demo;

public class try_catch_demo {

	public static void main(String[] args) {
		try {
			int a=10/0;
			
		} 
		catch (ArithmeticException e) {
			//
			
			//printing object
			System.out.println(e);
		}

	}

}
