package file_operation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_one_to_another {

	public static void main(String[] args) throws IOException {
		FileInputStream a=new FileInputStream("C:\\Users\\Pranav\\Desktop\\student.txt");
		FileOutputStream b=new FileOutputStream("C:\\Users\\Pranav\\Desktop\\pranav.txt");
		int i;
			try {
				while((i=a.read())!=-1)
						{
					      b.write((char)i);        
						}
				}
			finally
			{
			a.close();
			b.close();
			}

	}

}
