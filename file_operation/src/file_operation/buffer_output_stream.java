package file_operation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class buffer_output_stream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Pranav\\Desktop\\Course.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        //just remember it is used for fast performace
        String data="java full stack  9 months, web full stack 8 months";
         byte b[]=data.getBytes();
         bos.write(b);
         bos.flush();
         bos.close();
         fos.close();
	}

}
