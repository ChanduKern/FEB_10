public class BookingTask implements Runnable {

    private Theatre theatre;
    private String user;
    private int seats;
    private String category;

    public BookingTask(Theatre theatre, String user, int seats, String category) {
        this.theatre = theatre;
        this.user = user;
        this.seats = seats;
        this.category = category;
    }

    @Override
    public void run() {
        theatre.bookTicket(user, seats, category);
    }
}
