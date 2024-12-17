package file_operation;

import java.io.File;
import java.io.IOException;

public class File_rename {

	public static void main(String[] args) throws IOException{
		File a=new File("C:\\Users\\Pranav\\Desktop\\pranav.txt");
		//file alreay exists
		File b=new File("C:\\Users\\Pranav\\Desktop\\pranita.txt");
		//name-for renaming the file
		try {
				if(a.exists())
				{
					a.renameTo(b);
				}
				else
				{
					System.out.println("file does not exists");
				}
		}
		catch(Exception E)
		{
			System.out.println(E);
		}
		}

	}
