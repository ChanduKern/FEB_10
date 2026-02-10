public class ContractEmployee implements Employee {

    private int id;
    private String name;
    private double contractAmount;

    public ContractEmployee(int id, String name, double contractAmount) {
        this.id = id;
        this.name = name;
        this.contractAmount = contractAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}
