package patttern_programming;

public class inverted_pyramid {

	public static void main(String[] args) {
		int a=6;
		for(int i=1;i<=a;i++)
		{
			//first printing blank space and then printing pattern
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=a;k>=i;k--)
			{
				System.out.print(" x");
			}
			System.out.println(" ");
			

			
			
		}

	}

}
