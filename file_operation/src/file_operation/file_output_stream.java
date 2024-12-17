package file_operation;

import java.io.FileOutputStream;
import java.io.IOException;

public class file_output_stream {

	public static void main(String[] args) throws IOException {
		
	
		    FileOutputStream fos=new FileOutputStream("C:\\Users\\Pranav\\Desktop\\Ce.txt");    
		    String empdata="Empno:1111 Name:pranav City: Pune";
		    byte b[]=empdata.getBytes();
		   
		    fos.write(b);
		    fos.close();
		   
		  

	}

}
