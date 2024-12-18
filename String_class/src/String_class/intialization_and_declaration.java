package String_class;

public class intialization_and_declaration {

	public static void main(String[] args) {
		String a="pranav";
		//this will create only one object
		//create object in string constant pool
		
		String b=new String("pranav");
		//this will create two objects
		// create object in heap memory and string constant pool
		
		char[] c= {'p','r','a','n','a','v'};
		//same as first above example
		//check after run
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
