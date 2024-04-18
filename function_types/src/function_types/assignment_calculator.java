package function_types;

public class assignment_calculator {		
	public int add(int a,int b)	
	{ 
		int sum = a+b;
		return sum;
	}
	
	public int sub(int a,int b)
	{ 
		 int sub = a-b;
		 return sub;
	}

	public int mult(int a,int b)
	{				
		int mult = a*b;
		return mult;
		
	}
	public int div(int a,int b)
	{
		int div = a/b;
		return div;	
	}
	public static void main(String args[])
	{
		assignment_calculator cal =new assignment_calculator();
		int addition = cal.add(10,20);
		int subtraction = cal.sub(10,20);
		int multiplication=cal.mult(10,20);
		int division = cal.div(10,20);

		System.out.println("The sum of two number "+addition);
		System.out.println("The sum of two number "+subtraction);
		System.out.println("The sum of two number "+multiplication);
		System.out.println("The sum of two number "+division);
	}
}