public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Savings account: No overdraft allowed");
        }
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }
}
