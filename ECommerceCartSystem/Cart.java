import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public double calculateFinalAmount() {
        double total = calculateTotal();
        if (discountStrategy != null) {
            return discountStrategy.applyDiscount(total);
        }
        return total;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // BONUS: Sorting using Comparator
    public void sortByPrice() {
        products.sort(Comparator.comparing(Product::getPrice));
    }

    public void showProducts() {
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
    }
}
