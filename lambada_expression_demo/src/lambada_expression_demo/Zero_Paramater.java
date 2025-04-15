package lambada_expression_demo;

@FunctionalInterface
interface ZeroParameterexample {
    void display();
}

public class Zero_Paramater {

	    public static void main(String[] args)
	    {
	        // Lambda expression with zero parameters
	        ZeroParameterexample zeroParamLambda = ()
	            -> System.out.println(
	                "This is a zero-parameter lambda expression!");

	        // Invoke the method
	        zeroParamLambda.display();
	    }
	}