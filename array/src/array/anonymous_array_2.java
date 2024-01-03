package array;

public class anonymous_array_2 
{
	 
	static void sum(int[][] no) {
		
	  int sum=0;
	  for(int ii[]:no)
	  {
		  for(int i:ii)
		  {
			  sum=sum+i;
		  }
	  }

	}


	public static void main(String[] args) 
	{
		
		anonymous_array_2.sum(new int[][]{{2,3,4},{5,6,7}});
	}

	
	

	
}
