package patttern_programming;

public class number_pattern8 {

	public static void main(String[] args) {
        int a=7;
		for(int i=1;i<a+1;i++)
		{
			int num=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+num);
				num=num+(a)-j;
			}
			System.out.println(" ");
		}
		

	}

}
