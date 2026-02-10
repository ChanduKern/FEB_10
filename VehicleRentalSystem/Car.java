public class Car extends Vehicle {

    public Car(int vehicleId, String brand) {
        super(vehicleId, brand);
    }

    @Override
    public double calculateRentalPrice(int days) {
        return days * 2000;
    }
}
