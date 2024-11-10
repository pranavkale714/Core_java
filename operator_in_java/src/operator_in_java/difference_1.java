package operator_in_java;

public class difference_1 {

	public static void main(String[] args) {
		System.out.println("difference between << and <<<");
	    System.out.println("for positive number it work same");
	    System.out.println("for neagative number it change parity bit (msb) to zero");


	  //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	  //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	
	}

}
