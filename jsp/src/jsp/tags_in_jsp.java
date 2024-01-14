package jsp;

public class tags_in_jsp {

	public static void main(String[] args) {
		System.out.println("1.scripting");
		System.out.println("<%    java_code   %>");
		System.out.println("with help of this we can enter java code indside jsp code");
		System.out.println("scrpting tag divide in 3 types");
		
		System.out.println("i.scriplet");
		System.out.println("<%    java_code   %>");
		System.out.println("used to include java code");
		
		System.out.println("ii.declaration");
		System.out.println("<%!  java_code   %>");
		System.out.println("used to declare method or variable");
		
		System.out.println("iii.expression");
		System.out.println("<%=    java_code   %>");
		System.out.println("using it we  print variable");
		
		
		
		System.out.println("2.directive");
		System.out.println("<%@ java_Code %>");
		System.out.println("directive tag are used to provide instruction or directive to jsp container about how to handle jsp page during compilation and execution");
		System.out.println("The jsp directives are messages that tells the web container how to translate a JSP page into the corresponding servlet.");
		System.out.println("there are three types directive");
		
		System.out.println("i.page directive");
		System.out.println("<%@ page attribute=''value'' %>");
		//The page directive defines attributes that apply to an entire JSP page.
		/*page attributes are:
			1.import
			2.contentType
			extends
			info
			buffer
			3.language
			isELIgnored
			isThreadSafe
			autoFlush
			4.session
			pageEncoding
			5.errorPage
			6.isErrorPage
		*/
		
		System.out.println("ii.include directive");
		System.out.println("<%@ include file=''resources'' %>");
		
		System.out.println("iii.taglib directive");
		System.out.println("<%@ taglib uri(its uri not url)=''value''  prefix==''value'' %>");
		System.out.println("you can anther new tag using taglib refer line 62");
		
		
		System.out.println("3.action");
		System.out.println("< jsp:             />");
		System.out.println("can be used to i.to include page ii.to forward another page iii.to get or set values");
		System.out.println("action tag provide a way to intract with java object,control flow");
		System.out.println("and perform action like forwarding,including other resorces and manipulating data");
		System.out.println("action tag divide in 3 types");
		
		System.out.println("i.include tag");
		System.out.println("<% jsp:include %>");
		
		System.out.println("ii.forward tag");
		System.out.println("<% jsp:forward %>");
		
		System.out.println("iii.beans action tag");
		System.out.println("<% jsp:getProperty %>");
		System.out.println("<% jsp:setProperty %>");
		System.out.println("<% jsp:usebeans %>");
		System.out.println("etc");
		
		
		
		System.out.println("there are lots of tags come after jsp that we can use ");
		System.out.println("JSTL-(JAVA Standard Template library");
		System.out.println("spring mvc tag");
		System.out.println("jsp-(java server faces tag)");
		System.out.println("struct tag etc");
	}

}
