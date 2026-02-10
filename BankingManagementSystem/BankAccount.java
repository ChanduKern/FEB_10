import java.util.ArrayList;

public abstract class BankAccount {
    private String accountNumber;
    protected double balance;
    protected ArrayList<String> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactions.add("Account created with balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public void showTransactions() {
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
