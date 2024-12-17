package file_operation;
import java.io.File;
import java.io.IOException;

public class create_file {

	public static void main(String[] args) throws IOException {
		File a=new File("C:\\Users\\Pranav\\Desktop\\pranav.txt");
		if(a.createNewFile())
		{
			System.out.println("FILE CREATED");
			
		}
		else {
			System.out.println("File alreay exists");
		}
	}

}
