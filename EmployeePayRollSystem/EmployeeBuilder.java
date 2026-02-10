public class EmployeeBuilder {

    private int id;
    private String name;
    private double salary;
    private int hours;
    private double rate;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Employee buildFullTime(double monthlySalary) {
        return new FullTimeEmployee(id, name, monthlySalary);
    }

    public Employee buildPartTime(int hoursWorked, double hourlyRate) {
        return new PartTimeEmployee(id, name, hoursWorked, hourlyRate);
    }

    public Employee buildContract(double contractAmount) {
        return new ContractEmployee(id, name, contractAmount);
    }
}
