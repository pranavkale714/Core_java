package operator_in_java;

public class difference_2 {

	public static void main(String[] args) {
		//The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.

		//The bitwise & operator always checks both conditions whether first condition is true or false.
		
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a++<c);//false && true = false  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a<b&a++<c);//false && true = false  
		System.out.println(a);//11 because second condition is checked  
		
		System.out.println("****************");
		 a=10;  
		 b=5;  
		 c=20;  
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a>b|a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked  
		System.out.println(a>b|a++<c);//true | true = true  
		System.out.println(a);//11 because second condition is checked 
		
		
		

	}

}
