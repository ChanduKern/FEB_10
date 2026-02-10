public class BookingTask implements Runnable {

    private RentalSystem rentalSystem;
    private int vehicleId;
    private int days;

    public BookingTask(RentalSystem rentalSystem, int vehicleId, int days) {
        this.rentalSystem = rentalSystem;
        this.vehicleId = vehicleId;
        this.days = days;
    }

    @Override
    public void run() {
        rentalSystem.rentVehicle(vehicleId, days);
    }
}
