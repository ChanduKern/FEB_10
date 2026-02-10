import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Total Seats: ");
        int seats = sc.nextInt();
        sc.nextLine();

        Movie movie = new Movie(movieName);
        Theatre theatre = new Theatre(movie, seats);

        System.out.print("Enter number of users booking tickets: ");
        int users = sc.nextInt();
        sc.nextLine();

        Thread[] threads = new Thread[users];

        for (int i = 0; i < users; i++) {

            System.out.println("\nUser " + (i + 1));
            System.out.print("Enter User Name: ");
            String userName = sc.nextLine();

            System.out.print("Enter number of seats: ");
            int seatCount = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Seat Category (SILVER / GOLD / PLATINUM): ");
            String category = sc.nextLine();

            threads[i] = new Thread(
                    new BookingTask(theatre, userName, seatCount, category),
                    userName);
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        theatre.showBookingHistory();
        sc.close();
    }
}
