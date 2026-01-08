
public class Step_down_alphabet {

	public static void main(String[] args) {
	 for (int i = 0; i < 5; i++) {
            
            // Inner loop to print alphabets from A to A + i
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");  
            }
            System.out.println();
        }
    
	}

}
