package super_keyword;
//Super can be used to invoke immediate parent class constructor
//(implicitely)
class DemoUse3
{
	DemoUse3()
	{
		System.out.println("Im am in class DemoUse3");
	}
}

public class Use3 extends DemoUse3{

	Use3()
	{
		//super(); dont need to call
		System.out.println("Im in Class Use3");
	}
	public static void main(String[] args) {
		Use3 obj=new Use3();
	}
}
