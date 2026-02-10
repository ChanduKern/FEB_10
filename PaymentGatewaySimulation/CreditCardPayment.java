public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
        System.out.println("Credit Card Payment Successful");
    }
}
