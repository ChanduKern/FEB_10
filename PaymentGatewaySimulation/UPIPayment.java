public class UPIPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
        System.out.println("UPI Payment Successful");
    }
}
