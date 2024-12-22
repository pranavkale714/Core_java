package this_keyword;

public class use2 {
	void display()
	{
		System.out.println("hello");
	}
	void show()
	{
		this.display();
		
		//not need to use this
		//it will call implicitely
	}

	public static void main(String[] args) {
		// This Keyword can be used to invoke current class method(Implicitly)
		
		use2 td=new use2();
		td.show();
	}

}
