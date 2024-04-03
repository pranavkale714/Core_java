package constructor_types;

public class constructor_demo {
	public void constructor_demo()
	{
	System.out.println("inside method and this is not constructor this is method");
	}
	public constructor_demo() {
		
		System.out.println("non parameterised constructor");
	}

	public static void main(String[] args) {
		constructor_demo obj=new constructor_demo();
		obj.constructor_demo();

	}

}
