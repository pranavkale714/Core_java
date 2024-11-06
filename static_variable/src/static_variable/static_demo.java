package static_variable;

public class static_demo {
	static int a=25;
    //a=a+25 will give error because cannot access it by non static method
	public static void main(String[] args) {
		a=a+25; //can access by static method only
		System.out.println(a);
		//static variable can directly access by static method
	}
}
