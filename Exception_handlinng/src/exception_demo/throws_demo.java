package exception_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class throws_demo {
	
	void readfile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
		
	}

	void savefile() throws FileNotFoundException
	{
		FileOutputStream fis=new FileOutputStream("C:/bcd.txt");
		
	}

	public static void main(String[] args) {
		throws_demo ab=new throws_demo();
		try {
			ab.readfile();
		} catch (Exception e) {
			
		}
		System.out.println("hello");

	}

}
