public class PaymentFactory {

    public static PaymentMethod getPaymentMethod(String type) {

        return switch (type.toUpperCase()) {
            case "UPI" -> new UPIPayment();
            case "CARD" -> new CreditCardPayment();
            case "NETBANKING" -> new NetBankingPayment();
            default -> throw new IllegalArgumentException("Invalid Payment Method");
        };
    }
}
