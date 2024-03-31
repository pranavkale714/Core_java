package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializationdemo implements Serializable{
	int a;
	String b;
	public Serializationdemo(int product_id, String product_name) {
	    super();
	    this.a = product_id;
	    this.b = product_name;
	}

	public static void main(String[] args) throws IOException {

		FileOutputStream fos=new FileOutputStream("C:\\Users\\Pranav\\Desktop\\serialization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		Serializationdemo obj=new Serializationdemo(10, "pranav");
		
		oos.writeObject(obj);
		//saving value of int a in object
		
		System.out.println("");
		oos.close();
		fos.close();
		

	}

}
