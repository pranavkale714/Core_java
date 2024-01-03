package array;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //int A[][]=new int[3][3];
       int B[][]={{3,4,4},{5,3,1},{5,77,43}};
       Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) 
		{
			
			for(int j=0;j<3;j++)
			{
			System.out.println("enter number at index"+i+j);
			B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
			   System.out.println(B[i][j]);
			}
		}
	}

}
