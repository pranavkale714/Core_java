package patttern_programming;

public class ArrowDown {

	public static void main(String[] args) {
   int a=6;
		for(int i=a;i>=1;i--)
		{
			for(int j=a;j>i;j--)
			{
			System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{	
				if(k>1 && k<(i*2)-1)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			
			System.out.println();	
		}
	}

}
