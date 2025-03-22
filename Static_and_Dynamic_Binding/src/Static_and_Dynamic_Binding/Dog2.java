package Static_and_Dynamic_Binding;


// Dynamic_Binding_example
class Animal
{  
	void eat(){System.out.println("animal is eating...");}  
}  
		      
class Dog2 extends Animal
{  
    void eat()
    {
    	System.out.println("dog is eating...");
    }  
		      
	public static void main(String args[])
	{  
		 Animal a=new Dog2();  
		      a.eat();  
    }  
		      
}
