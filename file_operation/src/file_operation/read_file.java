package file_operation;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class read_file {

	public static void main(String[] args) throws IOException {
		
		FileReader f=new FileReader("C:\\Users\\Pranav\\Desktop\\pranav.txt");
		try {
		int a;
		//we are declaring intger becasue read method returns integer value
			while((a=f.read())!=-1)
			{
				//read method read only one character at time
				//the loop will continue till value reaches to -1
			System.out.print((char)a);
			}
		}
		finally {
			f.close();
		}
		
		
	}

}
