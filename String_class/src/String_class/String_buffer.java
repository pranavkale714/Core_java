package String_class;

public class String_buffer {

	public static void main(String[] args) {
		
		StringBuffer d=new StringBuffer();
	
		System.out.println(d.capacity());
		//16 is default capacity of stringbuffer object
		d.append("kale");
		System.out.println(d.capacity());
		//it means it can store 16 character
		
		//if charater will be greater than 16
		d.append("pranav dilip kale");
		System.out.println(d.capacity());
		//16*2+how many more chracter
		//(old capacity*2)+2--formula
		
		
		StringBuffer b=new StringBuffer("pranav");
		System.out.println(b.capacity());
		//16+6=22
		//for this stringbuffer object capacity will 22
		//if we type more than 16 then capacity will increase as per formula
		
		//to change capacity
		b.ensureCapacity(100);
		System.out.println(b.capacity());
	
	}

}
