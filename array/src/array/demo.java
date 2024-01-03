package array;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		System.out.println("priting sum of the diagonal element");
		int A[][]=new int[4][4];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) 
		{
			
			for(int j=0;j<4;j++)
			{
			System.out.println("enter number at index"+i+j);
			A[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<4;i++) 
		{
			for(int j=0;j<4;j++)
			{
			   if(i==j)
			   {
				   sum=sum+A[i][j];
						   
			   }
			}
		}
		System.out.println(sum);
		

	}

}
