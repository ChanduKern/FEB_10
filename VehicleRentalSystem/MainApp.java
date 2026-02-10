public class MainApp {

    public static void main(String[] args) {

        RentalSystem system = new RentalSystem();

        system.addVehicle(new Car(1, "Toyota"));
        system.addVehicle(new Bike(2, "Yamaha"));
        system.addVehicle(new Truck(3, "Tata"));

        Thread t1 = new Thread(new BookingTask(system, 1, 3), "Customer-1");
        Thread t2 = new Thread(new BookingTask(system, 1, 2), "Customer-2");
        Thread t3 = new Thread(new BookingTask(system, 2, 1), "Customer-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
