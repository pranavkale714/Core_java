package Static_method_Rules;
public class Static_Method_Rule {

	public static void main(String[] args) {
		
		System.out.println("Rule no1-Static method belong to the class not the object(Does not need to create object)");
		System.out.println("Rule no2-A 'Static' method  can be accessed directly by class name and doesnt need any object");
		System.out.println("Rule no3-A 'Static' method cam be access only static data.it cannot access non-static data.it cannot accesss not static data(instance data)");
		System.out.println("Rule no4-A 'Static' method call only other static methods and cannot call a non-static method");
		System.out.println("Rule no5 - A static method cannot refer to 'this' or 'super' keyword in any way");
		

	}

}
