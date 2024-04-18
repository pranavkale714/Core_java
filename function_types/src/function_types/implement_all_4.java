package function_types;

public class implement_all_4 {

	void npnr()
	   {
		 System.out.println("non parameterised non return type method");
	   }
	
	int pr(int a)
	   {
		 
		 System.out.println("parameterised and return type method");
		 return a;
	   }
	
	void pnr(int a)
	   {
		 System.out.println("parameterised and non return type method");
	   }
	
	int npr()
	   {
		 int a=5;
		 System.out.println("non parameterised and return type");
		 return a;
	   }
	public static void main(String[] args) {
		implement_all_4 obj=new implement_all_4();
		obj.npnr();
		int c=obj.npr();
		System.out.println(c);
		int e=obj.pr(10);
		System.out.println(e);
		obj.pnr(5);
		
   
	}

}
