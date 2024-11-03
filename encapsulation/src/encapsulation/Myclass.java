package encapsulation;

class Myclass
{
private int a;
Myclass()   //constructor cannot be final
{
a=20;
}
public int getA()
{
    return a;
}
}
class Test
{
    public static void main(String args[])
    {   
    	Myclass obj=new Myclass();
        System.out.print(obj.getA());
    }
}
