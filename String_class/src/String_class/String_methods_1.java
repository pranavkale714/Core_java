package String_class;

public class String_methods_1 {

	public static void main(String[] args) {
		 String a=new String("pranav");
		 String z=null;
		 String b="";
		 String c="  ";
		 String d="  pranav     kale   ";
		 String e="pranav";
		 String f="PRANAV";
		
		 // concat
	     a=a.concat("   kale");
	     System.out.println(a);
	     
	    //length
	     System.out.println(a.length());
	     //it will count blank spaces too
	     //it will not work for null strings
	     //E.G. if we try z.length it will throw null pointer exception
	    
	    //isEmpty 
	     System.out.println(b.isEmpty());
	     //check string is empty or not
	     //it will not work for null string
	     //E.G. if we try z.isEmpty() it will throw null pointer exception
	     System.out.println(c.isEmpty());
	     //if blank space include it will return-false
	     
	    //trim
	     System.out.println(d.trim());
	     //it will remove left and right and left side empty spaces
	     //it will not remove middle blank spaces
	     
	     
	    //we can use it methods with other methods
	     System.out.println(c.trim().isEmpty());
	     System.out.println(d.trim().length());
	     //cannot use trim over boolean
	     //E.G.System.out.println(c.isEmpty().trim());
	     //this will throw error
	     
	    //equalsIgnoreCase
	     System.out.println(e.equalsIgnoreCase(f));
	     System.out.println(e.equals(f));
	     
	    //ComparedTo
	     System.out.println(e.compareTo(f));
	     //used to compared string in form of unicode(Ascii code)
	     //it will return intiger  value\
	     System.out.println(e.compareTo(f));
	     
	    //comparetoIgnoreCase
	     System.out.println(e.compareToIgnoreCase(f));
	   
	}

}
