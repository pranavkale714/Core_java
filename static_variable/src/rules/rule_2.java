package rules;
class demo
{

static int a=76;
}
public class rule_2 
{

	public static void main(String[] args) 
	{
     System.out.println("accessing static keyword from another class");
	 System.out.println(demo.a);
	 System.out.println("\nstatic variable can directly access by class name from another class(demo.a)");
	}

}
