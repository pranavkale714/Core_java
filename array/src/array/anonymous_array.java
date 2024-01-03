package array;

public class anonymous_array {
	
	
	void test_sum(int[] js)
	{
		int sum=0;
		for(int i:js)
		{
			sum=sum+i;
		}
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
		//anonyomous array-dont have any name
		//new int[3];
		//new int[]{2,3};
		//they are  for create single time use
		//it can be single or multidimentional
		//create AND intialize in single line
		
		anonymous_array obj=new anonymous_array();
		obj.test_sum(new int[]{2,3,4});

	}

}
