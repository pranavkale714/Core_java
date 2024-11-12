package patttern_programming;

public class Box_Pattern {

	public static void main(String[] args) {
		int a=8;
		for(int i=0;i<a;i++) 
		{
		   for(int j=0;j<a;j++)
		   {
			   if(i>=1 && j>=1 && i<=a-2 && j<=a-2)
			   {
			   System.out.print(" ");
			   }
			   else
			   {
				   System.out.print("x");
			   }
		   }
		   System.out.println("");
		}
		

	}

}
