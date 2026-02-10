import java.util.ArrayList;
import java.util.List;

public class RentalSystem {

    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public synchronized void rentVehicle(int vehicleId, int days) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == vehicleId && v.isAvailable()) {
                v.rentVehicle();
                System.out.println(
                        Thread.currentThread().getName() +
                                " booked vehicle " + vehicleId +
                                " | Cost: ₹" + v.calculateRentalPrice(days));
                return;
            }
        }
        System.out.println(
                Thread.currentThread().getName() +
                        " failed to book vehicle " + vehicleId +
                        " (Not Available)");
    }
}
