package constructor_types;

public class copy_construcor {
	int a;
     
	public copy_construcor(int x)
	{
		System.out.println("copy constructor");
		a=x;
	}
	
	copy_construcor(copy_construcor d1) 
	{
	    a=d1.a;	
	}
	
	void display()
	{
		System.out.println("value of a"+a);
	}

	public static void main(String[] args) {
		copy_construcor d1=new copy_construcor(11);
		d1.display();
		// in next line we are sending copy of first constructor to another constructor by passing its object
		copy_construcor d2=new copy_construcor(d1);
		d1.display();
		
	}

}
