package synchronise_2;


public class MYthread_a extends Thread{

	book_tickets_seat b;
	int seat;
	MYthread_a(book_tickets_seat b,int seat)
	{
		this.b=b;
		this.seat=seat;
	}
	
	@Override
	public void run() {
		b.book_seat(seat);
	}
}