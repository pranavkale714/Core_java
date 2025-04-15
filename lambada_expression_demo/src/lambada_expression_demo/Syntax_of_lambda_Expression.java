package lambada_expression_demo;

public class Syntax_of_lambda_Expression {
    public static void main(String[] args) {

    	//syntax 
    	//(arg a,arg b) followed by arrow -> {body in brackets}
        Runnable r1 = () -> {
            System.out.println("Lamda expression");
        };

        // Run the second one
        r1.run();
    }
}
