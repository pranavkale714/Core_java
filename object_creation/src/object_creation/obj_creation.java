package object_creation;

public class obj_creation {
int a=50;


	public static void main(String[] args) {
		obj_creation abc=new obj_creation();
		class_2 cde=new class_2();
		System.out.println(abc.a);
		System.out.println(cde.b);
		System.out.println("\n we cannot access variable directly when it is outside main class \n we can access it by object only");
		System.out.println("if we try it will give error as accessing not static method by static method");
		
		

	}

}
