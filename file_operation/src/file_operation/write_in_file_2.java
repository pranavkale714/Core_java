package file_operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write_in_file_2 {

	public static void main(String[] args) throws IOException {
		
		    File f=new File("C:\\Users\\Pranav\\Desktop\\Student.txt");
		    FileWriter fw = new FileWriter(f);
		    fw.write("Learning dealing with file using java program");
		    fw.close();
		    }


}
