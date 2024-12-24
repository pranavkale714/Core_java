package this_keyword;

public class Use3 {
	//This Keyword used to invoke current constrctor
			Use3()
			{
				this(10);
				System.out.println("hello");
			}
			Use3(int a)
			{
				System.out.println("Parameterised constructor");
			}

	public static void main(String[] args) {
		Use3 td=new Use3();
	}

}
