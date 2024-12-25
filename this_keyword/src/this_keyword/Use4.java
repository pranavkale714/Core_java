package this_keyword;

public class Use4 {
	
	//This Keyword can be used to pass as an argument in method call

	void m1(Use4 td)
	{
		System.out.println("In m1 method");
	}
	void m2()
	{
		m1(this);
	}
	public static void main(String[] args) {
		Use4 td=new Use4();
		td.m2();
		

	}

}
