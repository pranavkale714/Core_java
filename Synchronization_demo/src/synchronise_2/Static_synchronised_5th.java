package synchronise_2;

public class Static_synchronised_5th extends Thread {

    public static void main(String[] args) {

        book_tickets_seat pranav = new book_tickets_seat();
        MYthread_a t1 = new MYthread_a(pranav, 7);
        t1.start();

        MYthread2 t2 = new MYthread2(pranav, 6);
        t2.start();

        //-------------------------------

        book_tickets_seat kale = new book_tickets_seat();
        MYthread_a t3 = new MYthread_a(kale, 7);
        t3.start();

        MYthread2 t4 = new MYthread2(kale, 6);
        t4.start();
    }
}

class book_tickets_seat {

    static int total_seats = 20;

    static synchronized void book_seat(int seat) {
        if (total_seats >= seat) {
            System.out.println("seat booked");
            total_seats = total_seats - seat;
            System.out.println("seats-left=" + total_seats);
        } else {
            System.out.println("cannot booked seats");
            System.out.println("seats_left=" + total_seats);
        }
    }
}
