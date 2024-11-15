package exception_demo;

public class exception_information_printing {

	public static void main(String[] args) {
		try {
			int a=10/0;
			
		} 
		catch (ArithmeticException e) {
			//method 1
			e.printStackTrace();
			//it will print name,description,stacktrace
			
			
			//method 2
			System.out.println(e);
			System.out.println(e.toString());
			
			//method 3
			System.out.println(e.getMessage());
			//get discription
			
		}

	}

}
