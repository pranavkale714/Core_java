package String_class;

public class String_methods_3 {

	public static void main(String[] args) {
		// join method-it is static method provided by string class
		//syntax( join( CharSequence delimeter , CharSeqence.. Elements)
		//if delimeter is null then it will throw nullpointer expection
		//if elements is null then it will add null to delimeter
		//char sequnce elements means it can take number of character as argument
		
		String a="pranav";
		String b="pranita";
		String c="swapnil";
		String d="snehal";
		
		//join is static method so we call it by classname
		System.out.println(String.join(",",a,b,c,d));
		System.out.println(String.join(";",a,b,c,d));
		System.out.println(String.join(" & ",a));
		System.out.println(String.join(" ",a,b,c,d));
		

	}

}
