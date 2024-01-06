package servlet_theroy;

public class servlet_lifecycle {

	public static void main(String[] args) {
		System.out.println("step 1.Servlet class is loaded-when server started servlet is loaded in main memory and servlet object is creted");
		System.out.println("step 2.Servlet instance is created i.e init method");	
		System.out.println("init method is invoked-servlet object is initialize by calling init method");
		System.out.println("step 3.request handling-service method is invoked to handle client request");
		System.out.println("step 4.destroy method is invoke-when server is shut down destroy method will execute and deleted sevlet object");
	}
}
