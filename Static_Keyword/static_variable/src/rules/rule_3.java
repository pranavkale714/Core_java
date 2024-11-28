
package rules;

public class rule_3 {

	static int b;	
	static void display()//static method
	{   
		b++;
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		System.out.println("static has only one storage location--means it can access in static methods only");
	    rule_3.display();
	    //static method can access by class name directly
	}

}
