import java.util.Scanner;

public class MainApp {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                PayrollService payroll = new PayrollService();
                EmployeeBuilder builder = new EmployeeBuilder();

                while (true) {
                        System.out.println("\n===== PAYROLL MENU =====");
                        System.out.println("1. Add Full Time Employee");
                        System.out.println("2. Add Part Time Employee");
                        System.out.println("3. Add Contract Employee");
                        System.out.println("4. Generate Payroll Report");
                        System.out.println("5. Exit");
                        System.out.print("Enter choice: ");

                        int choice = sc.nextInt();

                        switch (choice) {

                                case 1:
                                        System.out.print("Enter ID: ");
                                        int id1 = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Enter Name: ");
                                        String name1 = sc.nextLine();
                                        System.out.print("Enter Monthly Salary: ");
                                        double salary = sc.nextDouble();

                                        payroll.addEmployee(
                                                        builder.setId(id1)
                                                                        .setName(name1)
                                                                        .buildFullTime(salary));
                                        break;

                                case 2:
                                        System.out.print("Enter ID: ");
                                        int id2 = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Enter Name: ");
                                        String name2 = sc.nextLine();
                                        System.out.print("Enter Hours Worked: ");
                                        int hours = sc.nextInt();
                                        System.out.print("Enter Rate per Hour: ");
                                        double rate = sc.nextDouble();

                                        payroll.addEmployee(
                                                        builder.setId(id2)
                                                                        .setName(name2)
                                                                        .buildPartTime(hours, rate));
                                        break;

                                case 3:
                                        System.out.print("Enter ID: ");
                                        int id3 = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Enter Name: ");
                                        String name3 = sc.nextLine();
                                        System.out.print("Enter Contract Amount: ");
                                        double amount = sc.nextDouble();

                                        payroll.addEmployee(
                                                        builder.setId(id3)
                                                                        .setName(name3)
                                                                        .buildContract(amount));
                                        break;

                                case 4:
                                        payroll.generatePayrollReport();
                                        break;

                                case 5:
                                        System.out.println("Exiting payroll system...");
                                        sc.close();
                                        return;

                                default:
                                        System.out.println("Invalid choice");
                        }
                }
        }
}
