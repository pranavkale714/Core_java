package synchronise;

public class synchoronised_block extends Thread {
	static book_tickets p;
	int seat;
	
	public void run() 
	{
		p.book_seat(seat);
	}
	public static void main(String[] args) 
	{
		p=new book_tickets();
		synchoronised_block pranav=new synchoronised_block();
		pranav.seat=5;
		pranav.start();
		
		synchoronised_block sw=new synchoronised_block();
		sw.seat=4;
		sw.start();	
		
		synchoronised_block rc=new synchoronised_block();
		rc.seat=4;
		rc.start();	
	}

}
class book_tickets{
	
	int total_seats=10;
	void book_seat(int seat)
	{
		synchronized (this) 
		//you can passed 1.object 2.reference or 3.expression in this block
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
	
	
	
	
	
	
}
