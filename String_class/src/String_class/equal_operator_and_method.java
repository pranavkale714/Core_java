package String_class;

public class equal_operator_and_method {

	public static void main(String[] args) {
		//== operator
		//it is use for refernece or adress comparison
		 String a=new String("pranav");
		 String b=new String("pranav");
		 
		System.out.println(a==b);
		//false
		//because it will check its adrees or reference
		
		
		System.out.println(a.equals(b));
		//true
		//this will check content of object
		 

	}

}
