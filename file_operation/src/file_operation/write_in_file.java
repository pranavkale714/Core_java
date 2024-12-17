package file_operation;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class write_in_file {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\Pranav\\Desktop\\pranav.txt");
		try
		{
			f.write("hi i am pranav");
		}
		finally {
			f.close();
		}
		
		
	}

}
