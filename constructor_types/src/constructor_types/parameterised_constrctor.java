package constructor_types;

public class parameterised_constrctor
{
	public void parameterised_constrctor()
	{
		System.out.println("inside method");
	}
	public parameterised_constrctor()	// non parameterised constructor
	{
		System.out.println("non parameterised constructor");
	}
	public parameterised_constrctor(int a) // parameterised constructor
	{
		this(); // calling non parameterised constructor
		System.out.println("parameterised constructor");
	}
	
	public static void main(String args[]){	
	parameterised_constrctor obj=new parameterised_constrctor(5);
	obj.parameterised_constrctor();
	}
}