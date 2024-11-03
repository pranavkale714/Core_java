package polymorphism;

public class child1 extends Parent {
	void fun()
	{
		System.out.println("child 1");
	}


	public static void main(String[] args) {
	
		Parent p1; //upcating-CREATING REFERENCE OF PARENT CLASS-
		p1=new Parent();
		p1.fun();
		p1=new child1();
		p1.fun();
		p1=new Child2();
		p1.fun();
		

	}

}
