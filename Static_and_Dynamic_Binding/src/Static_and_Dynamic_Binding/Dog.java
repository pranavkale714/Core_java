package Static_and_Dynamic_Binding;

public class Dog {

	// Static_Binding_example
	private void eat()
	{
		System.out.println("dog is eating...");
	}  
	public static void main(String[] args) {
		Dog d1=new Dog();  
	    d1.eat();  

	}

}