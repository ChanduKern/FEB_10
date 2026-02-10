import java.util.HashMap;
import java.util.Scanner;

public class BankApp {

    static HashMap<String, BankAccount> accounts = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> createAccount();
                    case 2 -> deposit();
                    case 3 -> withdraw();
                    case 4 -> checkBalance();
                    case 5 -> showHistory();
                    case 6 -> {
                        System.out.println("Thank you!");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void createAccount() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Type (1-Savings / 2-Current): ");
        int type = sc.nextInt();

        BankAccount acc = (type == 1)
                ? new SavingsAccount(accNo, bal)
                : new CurrentAccount(accNo, bal);

        accounts.put(accNo, acc);
        System.out.println("Account created successfully");
    }

    static void deposit() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        accounts.get(accNo).deposit(amt);
        System.out.println("Deposit successful");
    }

    static void withdraw() throws InsufficientBalanceException {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        accounts.get(accNo).withdraw(amt);
        System.out.println("Withdrawal successful");
    }

    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.println("Balance: " + accounts.get(accNo).getBalance());
    }

    static void showHistory() {
        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        accounts.get(accNo).showTransactions();
    }
}
