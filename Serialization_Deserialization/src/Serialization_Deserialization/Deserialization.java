package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserialization{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Pranav\\Desktop\\serialization.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        //TYPECASTING
        Serializationdemo obj=(Serializationdemo)ois.readObject();
        //YOU SHOULD KNOW NAME OF OBJECT
        //IN THIS CASE NAME WAS -Serializationdemo
        
        System.out.println(obj.a);
        
	}

}
