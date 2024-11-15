package exception_demo;

public class abc extends Exception 
{
	abc() {
		super("hi bro");
	}
	abc(String messege) {
		super(messege);
	}

}
