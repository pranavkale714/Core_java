package patttern_programming;

public class number_pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			for(int k=i-1;k>0;k--)
			{
				System.out.print(" "+k);
			}
			System.out.println(" ");
		}

	}

}
