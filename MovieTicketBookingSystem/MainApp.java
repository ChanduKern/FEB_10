public class MainApp {

    public static void main(String[] args) {

        Movie movie = new Movie("Inception");
        Theatre theatre = new Theatre(movie, 10);

        Thread t1 = new Thread(
                new BookingTask(theatre, "User-1", 4, "SILVER"));

        Thread t2 = new Thread(
                new BookingTask(theatre, "User-2", 3, "GOLD"));

        Thread t3 = new Thread(
                new BookingTask(theatre, "User-3", 5, "PLATINUM"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        theatre.showBookingHistory();
    }
}
