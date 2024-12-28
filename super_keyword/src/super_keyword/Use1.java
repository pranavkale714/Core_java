package super_keyword;

class use1demo
{
	int a=10;
}
public class Use1 extends use1demo  {
	//Super Keyword can be use to refer parent class instance variable
    int a=20;
    void show(int a)
    {
    	System.out.println(a);
    	System.out.println(this.a);
    	System.out.println(super.a);
    }
	public static void main(String[] args) {
		
		Use1 obj=new Use1();
		obj.show(30);

	}

}

