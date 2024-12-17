package file_operation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class buffer_input_stream {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pranav\\Desktop\\Course.txt");
        BufferedInputStream  bis=new BufferedInputStream(fis);
        int data;
         while ((data=bis.read())!=-1)
         {
               System.out.print((char)data); 
         }
        bis.close();
        fis.close();

	}

}
