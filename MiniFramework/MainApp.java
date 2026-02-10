import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MINI FRAMEWORK MENU =====");
            System.out.println("1. Order Service");
            System.out.println("2. User Service");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    FrameworkExecutor.run(new OrderService());
                    break;

                case 2:
                    FrameworkExecutor.run(new UserService());
                    break;

                case 3:
                    System.out.println("Exiting framework...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
