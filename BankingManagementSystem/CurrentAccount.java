public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {

        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }
}
