package String_class;

public class String_buffer_2 {

	public static void main(String[] args) {
		//differnece between capacity and length method
		
		StringBuffer a= new StringBuffer("pranav");
		StringBuffer b= new StringBuffer("kale");
		StringBuffer c=b.append("kale");
		StringBuffer d= new StringBuffer("pranavkale");
		
		a.append(" kale");
		//concat string at end
		System.out.println(a);
		
		//length
		System.out.println(a.length());
		
		//delete
		System.out.println(a.delete(3,6));
		
		//deletecharat
		System.out.println(a.deleteCharAt(0));
		
		//equals
	    //it is differnt than the string class method
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		//because both object refering same content
		
		//index of
		System.out.println(b.indexOf("k"));
		System.out.println(b.indexOf("a"));
		System.out.println(a.indexOf("pra"));
		//if not present -1
		
		//lastindexof
		System.out.println(d.lastIndexOf("a"));
		
		//insert
		System.out.println(a.insert(2, "jjj"));
		//after secod index it will add this
		
		//replace
		System.out.println(a.replace(3,6,"m"));
		//it will remove 345 index elemnts with only one m
		
		//reverse
		System.out.println(a.reverse());
		

	}

}
