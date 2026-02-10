import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PAYMENT GATEWAY =====");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");
        System.out.print("Choose payment option: ");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        PaymentMethod payment = null;
        String type = "";

        switch (choice) {
            case 1:
                payment = PaymentFactory.getPaymentMethod("UPI");
                type = "UPI";
                break;

            case 2:
                payment = PaymentFactory.getPaymentMethod("CARD");
                type = "CARD";
                break;

            case 3:
                payment = PaymentFactory.getPaymentMethod("NETBANKING");
                type = "NETBANKING";
                break;

            default:
                System.out.println("Invalid option");
                sc.close();
                return;
        }

        payment.pay(amount);

        TransactionLogger.log(
                "Payment Type: " + type +
                        ", Amount: ₹" + amount +
                        ", Status: SUCCESS");

        TransactionLogger.showLogs();
        sc.close();
    }
}
