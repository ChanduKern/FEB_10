public class FlatDiscount implements DiscountStrategy {
    private double discountAmount;

    public FlatDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - discountAmount;
    }
}
