public abstract class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected boolean isAvailable = true;

    public Vehicle(int vehicleId, String brand) {
        this.vehicleId = vehicleId;
        this.brand = brand;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentVehicle() {
        isAvailable = false;
    }

    public abstract double calculateRentalPrice(int days);
}
