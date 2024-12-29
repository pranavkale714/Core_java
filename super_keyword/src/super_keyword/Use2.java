package super_keyword;
//Super Keyword can be used to invoke immediate parent class method
class Demouse2{
	 void m1()
	{
		System.out.println("Im in class Demouse2");
	}
	
}

public class Use2 extends Demouse2{
	void m1()
	{
		System.out.println("Im in class Use2");
	}
	void show()
	{
		m1();
		super.m1();
	}
	public static void main(String[] args) {
		Use2 obj=new Use2();
		obj.show();

	}

}
