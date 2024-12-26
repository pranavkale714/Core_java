package this_keyword;
//This Keyword can be used to pass as an argument in the constructor call.
class  test5{
	test5(Use5 s)
	{
		System.out.println("Test class Constructor");
	}
}
public class Use5 {
	void m1()
	{
		test5 t=new test5(this);
	}

	public static void main(String[] args) {
		Use5 t=new Use5();
		t.m1();
	}

}
