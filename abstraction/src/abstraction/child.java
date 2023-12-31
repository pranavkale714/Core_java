package abstraction;

public class child extends Sampel1{
	void show() {
		System.out.println("implementation of abstact method");
		
	}
	static void fun()
	{
		System.out.println("static method define");
	}
	child()
	{
		//super();
		System.out.println("super keyword will call constructor implicitly ");
	}

}
