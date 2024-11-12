package patttern_programming;

public class step_down_mirror {

	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<=5;i++)
		{
			//first printing blank space and then printing pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("x");
			}
			System.out.println(" ");
			

			
			
		}
		
		
		
	}

}
