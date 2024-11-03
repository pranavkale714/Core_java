package polymorphism;

public class Sample1 {
	void Add()
	{		System.out.println("Addition"+(4+5));
	
	}
	void Add(int x,int y)
	{
		System.out.println("addition "+(x+y));
		
	}
	void Add(int x,float y)
	{
		System.out.println("addtion"+(x+y));
	}
	void Add(float x,int y)
	{
		System.out.println("addition"+(x+y));
		
	}
	public static void main(String[] args) {
		Sample1 a=new Sample1();
		a.Add();
		a.Add(5, 8);
		a.Add(6, 9f);
		a.Add(5f, 9);
	}

}
