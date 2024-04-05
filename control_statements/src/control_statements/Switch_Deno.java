package control_statements;

import java.util.Scanner;

public class Switch_Deno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the day number between 1-7 you want to know the name of the day");
		    Scanner obj=new Scanner(System.in);
		    int day_number= obj.nextInt();
		    switch(day_number)
		    {    
		        case 1:
		        System.out.println("Monday");
		        break;
		        case 2:
		        System.out.println("Tuesday");
		        break;
		        case 3:
		        System.out.println("Wednesday");
		        break;
		        case 4:
		        System.out.println("Thursday");
		        break;
		        case 5:
		        System.out.println("Friday");
		        break;
		        case 6:
		        System.out.println("Saturday");
		        break;
		        case 7:
		        System.out.println("Sunday");
		        break;
		        default:
		        System.out.println("Please input the day between 1-7");
		        break;

		    }

		    }
		
	

}
