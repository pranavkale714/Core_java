package String_class;

public class String_methods_4 {

	public static void main(String[] args) {
		//subsequnce method 
		//systax subsequence(int begainindex, int endindex);
		//this method return charater sequence
		
		String a="pranavkale";
		//012345678-String indexing
		
		System.out.println(a.subSequence(5, 10) + "\n");
		//System.out.println(a.subSequence(0, 15));
		//String out of bound-error
		//System.out.println(a.subSequence(-8,-7));
		//error
		
		
		//substring method
		//syntax- substring(int startindex,int endidex);
		//  or
		//syntax substring(int startinex);zz
		System.out.println(a.substring(5));
		System.out.println(a.substring(0,5));
		System.out.println(a.substring(6,10));
		System.out.println(a.substring(6));
		//System.out.println(a.substring(6,15));
		//error-index out of bound
		//System.out.println(a.substring(-5));
		//error
		//System.out.println(a.substring(-1,-4));
		//error
	}

}
