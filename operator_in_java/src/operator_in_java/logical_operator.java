package operator_in_java;

public class logical_operator {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int c=6;
		
		//LOGICAL && 
		System.out.println((a < b) && (b == c));
		
		//LOGICAL ||
		System.out.println((a > b) || (b == c));
		
		//LOGICAL !
		System.out.println(!(a < b));

	}

}
