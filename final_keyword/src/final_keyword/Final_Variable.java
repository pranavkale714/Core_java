package final_keyword;

public class Final_Variable {
	final int a;
	//initialization of final variable is nessesary
	Final_Variable()
	{
		a=5;
	//You can initialize final variable inside constructor
		System.out.println(a);
	}
    
	public static void main(String[] args) {
	   Final_Variable a=new Final_Variable();

	}

}
