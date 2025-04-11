package Math_Class;

public class Methods {

	public static void main(String[] args) {    
	    // abs() returns the absolute number  
	    System.out.println("Absolute number is: " +Math.abs(-10));     
				
	    // min() returns the minimum of two numbers    
	    System.out.println("Minimum number is: " +Math.min(10, 20));     
				
	    // max() returns the maximum of two numbers    
	    System.out.println("Maximum number is: " +Math.max(10, 20));     
				
	    // sqrt() returns the square root of given number    
	    System.out.println("Square root of y is: " + Math.sqrt(49));     
				
	    // pow() returns 10 power of 4 i.e. 10*10*10*10   
	    System.out.println("Power of x and z is: " + Math.pow(10, 4));     
				
	    // random() returns a random number     
	    System.out.println("Random number is: " +(int)(Math.random()*10));   
         int x=10;
         int y=20;
	    // return the logarithm of given value       
	    System.out.println("Logarithm of x is: " + Math.log(x));   
		System.out.println("Logarithm of y is: " + Math.log(y));  
				
		// return the logarithm of given value when base is 10      
		System.out.println("log10 of x is: " + Math.log10(x));   
		System.out.println("log10 of y is: " + Math.log10(y));    
	          
		// return the log of x + 1  
		System.out.println("log1p of x is: " +Math.log1p(x));    
	  
		// return a power of 2    
		System.out.println("exp of a is: " +Math.exp(x));    
	          
		// return (a power of 2)-1  
		System.out.println("expm1 of a is: " +Math.expm1(x));  
		
		int a=180;
		// converting values to radian    
	    double b = Math.toRadians(a);   
	          
		// return the trigonometric sine of a      
		System.out.println("Sine value of a is: " +Math.sin(a));    
	          
		// return the trigonometric cosine value of a  
		System.out.println("Cosine value of a is: " +Math.cos(a));  
	          
		// return the trigonometric tangent value of a  
		System.out.println("Tangent value of a is: " +Math.tan(a));  
	          
		// return the trigonometric arc sine of a (inverse of sin(raised to -1)   
		System.out.println("Sine value of a is: " +Math.asin(a));    
	        
	}

}
