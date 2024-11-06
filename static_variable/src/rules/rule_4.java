package rules;

public class rule_4 {
	static int a=7;

	public static void main(String[] args) {
		System.out.println("static variable can call directly by class name");
	System.out.println(a);
    // error error error System.out.println(b);
	System.out.println(abc.b);
	}

}
class abc
{
	static int b=45;

}

