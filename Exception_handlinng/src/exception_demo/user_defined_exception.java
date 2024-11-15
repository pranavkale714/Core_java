package exception_demo;

public class user_defined_exception
{
	
	public static void main(String[] args)
	{
			int a=16;
		
			if(a<=18)
			{
				try {
					throw new abc("you are not eligible");
				} catch (abc e) {
					e.printStackTrace();
				}
			}
		else
			{
			System.out.println("eligible");
			}
			
	}	
}
