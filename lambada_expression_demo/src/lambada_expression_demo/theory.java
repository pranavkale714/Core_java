package lambada_expression_demo;

public class theory {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Why Lambada Expression ?");	
	System.out.println("1.Quick and Short Function");
	System.out.println("2.It can be use only one time");


		System.out.println("Note:-It can be use multiple time if you assign it to variable");
		System.out.println("Example:-");
		Predicate<Integer> isEven = x -> x % 2 == 0;  // Lambda assigned to a variable
		System.out.println(isEven.test(10));  // true
		System.out.println(isEven.test(15));  // false 
	}

}

