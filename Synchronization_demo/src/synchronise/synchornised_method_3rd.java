package synchronise;

public class synchornised_method_3rd extends Thread {
	static book_ticket p;
	int seat;
	
	public void run() 
	{
		p.book_seat(seat);
	}
	public static void main(String[] args) 
	{
		p=new book_ticket();
		synchornised_method_3rd pranav=new synchornised_method_3rd();
		pranav.seat=5;
		pranav.start();
		
		synchornised_method_3rd sw=new synchornised_method_3rd();
		sw.seat=4;
		sw.start();	
	}

}
class book_ticket{
	
	int total_seats=10;
	synchronized void book_seat(int seat)
	{
		if(total_seats>=seat) 
		{
			System.out.println("seat booked");
			total_seats=total_seats-seat;
			System.out.println("seats-left="+total_seats);
		
		}
		else
		{
			System.out.println("cannot booked seats");
			System.out.println("seats_left="+total_seats);
		}
		
	}
	
	
	
	
	
	
}
