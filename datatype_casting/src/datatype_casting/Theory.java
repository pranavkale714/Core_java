package datatype_casting;

public class Theory {

	public static void main(String[] args) {
		
	   System.out.println("Data type casting OR type casting is a method or process that converts a data type into another data type in both ways manually and automatically.\n");

	   System.out.println("There are two types of type casting:\r\n"
	   		+ "1.Widening Type Casting\n"
	   		+ "2.Narrowing Type Casting\n");
	   
	   System.out.println("1.Widening Type Casting\r\n"
	   		+ "Converting a lower data type into a higher one is called widening type casting.\nIt is also known as implicit conversion or casting down.\nIt is done automatically.\n It is safe because there is no chance to lose data");
System.out.println("Both data types must be compatible with each other.\r\n"
		+ "The target type must be larger than the source type.");
	   System.out.println("byte -> short -> char -> int -> long -> float -> double \n");
	   
	   
	   System.out.println("2.Narrowing Type Casting");
	   System.out.println("Converting a higher data type into a lower one is called narrowing type casting.\n It is also known as explicit conversion or casting up.\n It is done manually by the programmer");
	   System.out.println("If we do not perform casting then the compiler reports a compile-time error.");
	   System.out.println("double -> float -> long -> int -> char -> short -> byte");
	}

}
