package instance_variable;

public class instance_variable {
	int a=10; //instance variable
	
	void method() //instance area
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		instance_variable obj=new instance_variable();
		
		System.out.println(obj.a);
		obj.method();
		//accesing instance variable
	
		

	}

}
