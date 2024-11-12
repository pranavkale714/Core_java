package patttern_programming;

public class step_up_and_down_reverse {

	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("x");
			}
			System.out.print("\n");
		}

		
		for(int i=1;i<=a;i++)
		{
			//first printing blank space and then printing pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=a-1;k>=i;k--)
			{
				System.out.print("x");
			}
			System.out.println(" ");
			

			
			
		}

	}

}
