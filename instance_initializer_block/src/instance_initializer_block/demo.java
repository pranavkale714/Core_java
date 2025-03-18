package instance_initializer_block;

public class demo {
	
	demo()
	{
		System.out.println("constructor is invoked");
	}  
	   
    {
    	System.out.println("instance initializer block invoked");
    }  

	public static void main(String[] args) {

			demo b1=new demo();  
			demo b2=new demo();  

		}

	}


