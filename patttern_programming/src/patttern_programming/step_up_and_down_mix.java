package patttern_programming;

public class step_up_and_down_mix {

	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("x");
			}
			System.out.print("\n");
		}
		//see changes done is this loop cause 5th line printing double
		for(int i=a-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("x");
			}
			System.out.print("\n");
		}
		

	}

}
