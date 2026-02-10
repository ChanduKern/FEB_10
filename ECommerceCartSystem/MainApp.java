import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n===== E-COMMERCE CART MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart Products");
            System.out.println("3. Calculate Total Amount");
            System.out.println("4. Apply Discount");
            System.out.println("5. Sort Products by Price");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nSelect Product Type:");
                    System.out.println("1. Electronics");
                    System.out.println("2. Clothing");
                    System.out.println("3. Groceries");
                    System.out.print("Choice: ");
                    int type = sc.nextInt();

                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    if (type == 1) {
                        cart.addProduct(new Electronics(name, price));
                    } else if (type == 2) {
                        cart.addProduct(new Clothing(name, price));
                    } else if (type == 3) {
                        cart.addProduct(new Groceries(name, price));
                    } else {
                        System.out.println("Invalid product type");
                    }
                    break;

                case 2:
                    System.out.println("\nProducts in Cart:");
                    cart.showProducts();
                    break;

                case 3:
                    System.out.println("Total Amount: ₹" + cart.calculateTotal());
                    break;

                case 4:
                    System.out.print("Enter discount percentage: ");
                    double percent = sc.nextDouble();
                    cart.setDiscountStrategy(new PercentageDiscount(percent));
                    System.out.println(
                            "Final Amount after discount: ₹" +
                                    cart.calculateFinalAmount());
                    break;

                case 5:
                    cart.sortByPrice();
                    System.out.println("Products sorted by price");
                    cart.showProducts();
                    break;

                case 6:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
