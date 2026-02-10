public class NetBankingPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Net Banking payment of ₹" + amount);
        System.out.println("Net Banking Payment Successful");
    }
}
