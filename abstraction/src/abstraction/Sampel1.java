package abstraction;

public abstract class Sampel1 {
	int x=33;
	abstract void show();  //declared
	Sampel1()
	{
		System.out.println("constructor define");
	}
	void disp()
	{
		System.out.println("define non abstract method");
		
	}
	static void fun()
	{
		System.out.println("static method define");
		
	}
	final void func2()
	{
		System.out.println("final method");
	}

	

}
