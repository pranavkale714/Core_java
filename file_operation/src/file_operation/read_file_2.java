package file_operation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file_2 {

	public static void main(String[] args) throws FileNotFoundException {
		File F=new File("C:\\Users\\Pranav\\Desktop\\pranav.txt");
		
		Scanner sc=new Scanner(F);
		//passin file object to scanner class
		
		String data;
		//beacuse hasnextline return string value
		
		while(sc.hasNextLine())
		{
			data=sc.nextLine();
			System.out.println(data);	
		}
		

	}

}
