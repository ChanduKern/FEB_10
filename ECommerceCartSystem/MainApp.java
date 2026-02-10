public class MainApp {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new Electronics("Laptop", 55000));
        cart.addProduct(new Clothing("Shirt", 1500));
        cart.addProduct(new Groceries("Rice Bag", 1200));

        System.out.println("Products in Cart:");
        cart.showProducts();

        System.out.println("\nTotal Amount: ₹" + cart.calculateTotal());

        cart.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("After 10% Discount: ₹" + cart.calculateFinalAmount());

        cart.sortByPrice();
        System.out.println("\nProducts After Sorting by Price:");
        cart.showProducts();
    }
}
