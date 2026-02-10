import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private int totalSeats;
    private Movie movie;
    private List<String> bookingHistory = new ArrayList<>();

    // Seat category prices
    private final int SILVER_PRICE = 150;
    private final int GOLD_PRICE = 250;
    private final int PLATINUM_PRICE = 400;

    public Theatre(Movie movie, int totalSeats) {
        this.movie = movie;
        this.totalSeats = totalSeats;
    }

    public synchronized void bookTicket(String user, int seats, String category) {

        if (seats <= totalSeats) {

            totalSeats -= seats;
            int price = calculatePrice(seats, category);

            bookingHistory.add(
                    user + " booked " + seats +
                            " seats (" + category + ")" +
                            " | Price: ₹" + price);

            System.out.println(
                    user + " successfully booked " + seats +
                            " seats for " + movie.getMovieName() +
                            " | Remaining Seats: " + totalSeats);
        } else {
            System.out.println(
                    user + " failed to book tickets (Not enough seats)");
        }
    }

    private int calculatePrice(int seats, String category) {
        return switch (category) {
            case "GOLD" -> seats * GOLD_PRICE;
            case "PLATINUM" -> seats * PLATINUM_PRICE;
            default -> seats * SILVER_PRICE;
        };
    }

    public void showBookingHistory() {
        System.out.println("\n--- Booking History ---");
        for (String record : bookingHistory) {
            System.out.println(record);
        }
    }
}
