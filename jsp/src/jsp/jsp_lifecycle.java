package jsp;

public class jsp_lifecycle {

	public static void main(String[] args) {
		System.out.println("step 1-translation");
		System.out.println("jsp is converted to servlet");
		
		System.out.println("step 2-compilation");
		System.out.println("generated servlet converted into byte code");
		
		System.out.println("step 3-loding and instantiation");
		System.out.println("same as servlet");
		
		System.out.println("step 4-initialization");
		System.out.println("in servlet-init()");
		System.out.println("in jsp-jsp.init()");
		
		System.out.println("step 5-request handling");
		System.out.println("in servlet-service(),doget(),dopost()");
		System.out.println("in jsp-jspservice()");
		
		System.out.println("step 6-destroy");
		System.out.println("in servlet-destroy()");
		System.out.println("in jsp-jspdesroy()");
	}

}
