package operator_in_java;

public class Bitwise_operator {

	public static void main(String[] args) {
	//right shift operator
        System.out.println(10>>2);
        //10/2^2=10/4=2  
        System.out.println(20>>2);
        //20/2^2=20/4=5  
        System.out.println(20>>3);
        //20/2^3=20/8=2  
        
     //left shift operator
        System.out.println(10<<2);
        //10*2^2=10*4=40  
        System.out.println(10<<3);
        //10*2^3=10*8=80  
        System.out.println(20<<2);
        //20*2^2=20*4=80  
        System.out.println(15<<4);
        //15*2^4=15*16=240    
        
        
     //bitwise &    (and)
        int a=5; //0101  
        int c=7; //0111
             //ans 0101
        System.out.println(a & c);
        
      //bitwise |    (or)
        	a=5; //0101  
        	c=7; //0111
        	 //ans 0111
        System.out.println(a | c);
        

      //bitwise ^   (xor)-logic both should different else 0 
        a=5; //0101  
        c=7; //0111
         //ans 0001
        
        System.out.println(a ^ c);
        
      //bitwise ~  returns ones complemet of number MINUS 1
        System.out.println(~10); //-11
        System.out.println(~-5);
        

     

	}

}
