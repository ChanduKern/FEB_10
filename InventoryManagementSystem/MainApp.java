import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n===== INVENTORY MENU =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Delete Product");
            System.out.println("4. Search Product by ID");
            System.out.println("5. Search Product by Name");
            System.out.println("6. Stock Report");
            System.out.println("7. Export Stock Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Stock: ");
                        int stock = sc.nextInt();
                        inventory.addProduct(new Product(id, name, stock));
                        break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        inventory.updateStock(sc.nextInt(), sc.nextInt());
                        break;

                    case 3:
                        System.out.print("Enter Product ID: ");
                        inventory.deleteProduct(sc.nextInt());
                        break;

                    case 4:
                        System.out.print("Enter Product ID: ");
                        Product p = inventory.searchProduct(sc.nextInt());
                        System.out.println(p != null ? p : "Not found");
                        break;

                    case 5:
                        sc.nextLine();
                        System.out.print("Enter Product Name: ");
                        inventory.searchProduct(sc.nextLine())
                                .forEach(System.out::println);
                        break;

                    case 6:
                        inventory.stockReport();
                        break;

                    case 7:
                        inventory.exportToFile();
                        break;

                    case 8:
                        System.out.println("Thank you!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
