package static_block;

public class static_block {
	static
	{
		System.out.println("static block execute first\neven it is after main method");
	}
	static
	{
		System.out.println("static block can be use multiple times");
	}
	public static void main(String[] args)
	{
		
	}

}
