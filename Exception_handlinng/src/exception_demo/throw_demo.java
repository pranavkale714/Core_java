package exception_demo;

public class throw_demo {

	public static void main(String[] args)  {
		int a=17;
		if(a<18)
		{
			throw new userdefinedclass("you are not eligible");
			//see class userdefinedclass
			//exception not handled yet
		    //it will throw user 
		}
		else
		{
			System.out.println("");
		}

	}

}
