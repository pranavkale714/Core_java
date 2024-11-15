package exception_demo;

public class Finally_block_demo_2 {

	public static void main(String[] args) {
		try {
			int a=10/0;
			
		} 
		catch (ArithmeticException e) {
			//
			
			//printing object
			System.out.println("i am in catch block");
		}
		finally {
			System.out.println("i am in finally");
		}

	}

}
