public class Truck extends Vehicle {

    public Truck(int vehicleId, String brand) {
        super(vehicleId, brand);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 3500;
    }
}
