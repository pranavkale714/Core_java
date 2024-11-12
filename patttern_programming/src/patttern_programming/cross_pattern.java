package patttern_programming;

public class cross_pattern {

	public static void main(String[] args) {
		int a=5;
		
		for( int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i==j || i+j==a-1)
				{
			     System.out.print("x");
				}
				else 
				{
				System.out.print(" ");	
				}
			}
			System.out.println("");
		}    
	}

}
