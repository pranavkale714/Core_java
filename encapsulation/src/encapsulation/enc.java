package encapsulation;

class enc
{
	
	private int empid;
	public void setEmpid(int empid1)
	{
      empid=empid1;		
	}
	public int getEmpid()
	{
	  return empid;
	}
class fina
{
	public static void main (String[] args)
	
		{
		enc a=new enc();
		a.setEmpid(122);
		
		System.out.println(a.getEmpid());
	
		}
}
	
}
