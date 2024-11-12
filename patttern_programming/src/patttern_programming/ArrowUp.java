package patttern_programming;

public class ArrowUp {

	public static void main(String[] args) {
		int a=5;
	
		int i,j,k;
		for( i=1;i<=a;i++)
		{
			for(k=a;k>i;k--)
			{
			System.out.print(" ");
			}
			for(j=1;j<(i*2);j++)
			{
				if(j>1 && j<(i*2)-1) 
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");	
		}
	}

}
