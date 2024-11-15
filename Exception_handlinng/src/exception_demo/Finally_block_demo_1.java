package exception_demo;

public class Finally_block_demo_1 {

	public static void main(String[] args) {
		try {
			int a=10/0;
			
		} 
		finally {
			System.out.println("i am in finally block");
		}

	}

}
