package patttern_programming;

public class number_pattern3 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+k);
				k=k+1;
			}
			System.out.println(" ");
		}
	}

}
