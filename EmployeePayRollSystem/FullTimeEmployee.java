public class FullTimeEmployee implements Employee {

    private int id;
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
