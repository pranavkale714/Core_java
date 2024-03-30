package Aggregation;
public class Employee {
	int id;
	String name;
	float salary;
	DOJ j1;//AGGREGATION-creating reference of another class-does not have relation between this two calsses
	
	public Employee(int id,String name,float salary,DOJ j1)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.j1=j1;
	
	}
	void display()
	{
		System.out.println("Employee id="+id+" Name="+name+" Salary="+salary);
		System.out.println("date of joining");
		System.out.println(j1.dd+" "+j1.month);
	}
}
