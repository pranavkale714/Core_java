package patttern_programming;

public class number_pattern_6 {

	public static void main(String[] args) {
		        
		        int rows = 5;
		        
		       
		        for(int i=1; i<=rows; i++) {
		           
		            for(int s=rows; s>i; s--) {
		                System.out.print("  ");
		                }
		            

		            for(int j=1; j<=i; j++) {
		                System.out.print(j + " ");
		            }
		            
		          
		            for(int k=i-1; k>=1; k--) {
		                System.out.print(k + " ");
		            }
		            
		     
		            System.out.println();
		        }
	}

}
