package String_class;

public class String_methods_5 {

	public static void main(String[] args) {
		// replace();
		// replaceFirst();
		// replaceall();
		
		String a="this is pranav";
		//replace
		System.out.println(a.replace("is", "was"));
		System.out.println(a.replace(" is ", " was "));
		
		//replaceFirst
		System.out.println(a.replaceFirst("is", "was"));
		//it will replace only one time 
		//changes done only one time
		
		//replaceall
		//almost same is replace
		//in replaceall we can provide regular expression
		System.out.println(a.replaceAll("is","was"));
		System.out.println(a.replaceAll("is(.)","was"));
		//above will replace spaces also
		System.out.println(a.replaceAll("is(.*)", "was"));
		//it will relace is by was and remove all next character
		

	}

}
