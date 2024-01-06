package servlet_theroy;

public class servlet_types {

	public static void main(String[] args) {
		System.out.println("hierarchy of servlet");
		System.out.println("1.servlet-this is interface");
		//class mysrevlet implements Servlet
			//{
					System.out.println("it defines servlet life cycle method only \nlike init,service,destroy \nhence use very less\n");		
			//}
		System.out.println("2.genericservlet-this is class");
		System.out.println("it implement servlet interface");
			//class mysrevlet extends GenericServlet
			//{
				System.out.println("use when we want to create protocol-independent servlet");
				System.out.println("protocol-independent servlet is a servlet that can handle request from different network protocol such as http,https,ftp and more");
				System.out.println("we do not-do not createb request and response object (not present)");
			//}
		System.out.println("3.httpservlet-this is class");
		System.out.println("it extends generic servlet");
			//class mysrevlet extends httpservlet
			//{
					System.out.println("it is used when we want htpp specific method and request and response object");
					System.out.println("http specific methods are get,post,put,delete,head");
					// }

				}
}
