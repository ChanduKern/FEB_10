import java.util.ArrayList;
import java.util.List;

public class PayrollService {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void generatePayrollReport() {
        System.out.println("\n--- Payroll Report ---");

        for (Employee e : employees) {
            System.out.println(
                    "ID: " + e.getId() +
                            ", Name: " + e.getName() +
                            ", Salary: ₹" + e.calculateSalary());
        }
    }
}
