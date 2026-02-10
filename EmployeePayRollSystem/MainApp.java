public class MainApp {

    public static void main(String[] args) {

        PayrollService payroll = new PayrollService();

        EmployeeBuilder builder = new EmployeeBuilder();

        Employee e1 = builder.setId(1).setName("Ravi")
                .buildFullTime(50000);

        Employee e2 = builder.setId(2).setName("Anita")
                .buildPartTime(80, 400);

        Employee e3 = builder.setId(3).setName("Suresh")
                .buildContract(60000);

        payroll.addEmployee(e1);
        payroll.addEmployee(e2);
        payroll.addEmployee(e3);

        payroll.generatePayrollReport();
    }
}
