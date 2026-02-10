public class Bike extends Vehicle {

    public Bike(int vehicleId, String brand) {
        super(vehicleId, brand);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 800;
    }
}
