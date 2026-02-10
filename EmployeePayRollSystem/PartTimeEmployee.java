public class PartTimeEmployee implements Employee {

    private int id;
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
