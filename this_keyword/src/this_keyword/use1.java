package this_keyword;
class Test
{//This Keyword can be used to do refer current class instance variable.
	int i;        //global variable
	void Disp(int i)    //local varible
	{
		this.i=i;
	}
	void show()
	{
		System.out.println(i);
	}
}

public class use1 {
	public static void main(String[] args) {
      Test t=new Test();
      t.Disp(10);
      t.show();	
	}
}

