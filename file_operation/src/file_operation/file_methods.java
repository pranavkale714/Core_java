package file_operation;

import java.io.File;
import java.io.IOException;

public class file_methods {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Pranav\\Desktop\\sss.txt");
		if(f.exists())
		    {
		        System.out.println("File already exists");
		        System.out.println("File name is: "+f.getName());
		        System.out.println("File path is: "+f.getPath());
		        System.out.println("File absolute path: "+f.getAbsolutePath());
		        System.out.println("The data in file is: "+f.length());
		        System.out.println("can read file: "+f.canRead());
		        System.out.println("can read file: "+f.canWrite());
		        System.out.println("to delete file :"+f.delete());
		    }
		    else
		    {
		            //if file not exists
		            f.createNewFile();
		            System.out.println("File created");
		        
		    }

	}

}
