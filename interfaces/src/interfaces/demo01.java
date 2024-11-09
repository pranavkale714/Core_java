package interfaces;

public class demo01 implements demo {

	@Override
	public void m1() {
		System.out.println(a);
        System.out.println("defining interface method1");
		
	}

	@Override
	public void m2() {
		System.out.println("defining interface method2");
		
	}
	
	 public static void main(String[] args) {
		    
	        demo01 obj=new demo01();
	        obj.m1();
	        obj.m2();
	    }

}
