package String_class;

public class String_methods_6 {

	public static void main(String[] args) {
		String a="pranav";
		
		//indexof
		System.out.println(a.indexOf("a"));
		//find starting a index
		System.out.println(a.indexOf("ra"));
		
		//lastindexof
		// it will find out last position
		System.out.println(a.lastIndexOf("a"));
		
		//charat
		System.out.println(a.charAt(4));
		
		//contains
		//return boolean value
		System.out.println(a.contains("ra"));
		
		//Startwith
		//return boolean value
		System.out.println(a.startsWith("p"));
		System.out.println(a.startsWith("P"));
		System.out.println(a.startsWith("pr"));
		
		//endswith
		//return boolean value
		System.out.println();
		System.out.println(a.endsWith("v"));
		System.out.println(a.endsWith("av"));

	}

}
