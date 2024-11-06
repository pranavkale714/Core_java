package rules;

public class rule_1
{
	static int a=10;
	void m1()
	{
	//	static int b=56; //local vatriable
		System.out.println("error -rule1-local variable cannot be static");
	}

	public static void main(String[] args) 
	{
		
		System.out.println(a);
		rule_1 obj=new rule_1();
		obj.m1();
		
		
	}

}
