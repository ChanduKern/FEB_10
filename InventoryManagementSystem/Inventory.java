import java.util.*;
import java.util.stream.Collectors;
import java.io.FileWriter;
import java.io.IOException;

public class Inventory {

    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println("Product added successfully");
    }

    public void updateStock(int id, int newStock) {
        Product p = products.get(id);
        if (p != null) {
            p.setStock(newStock);
            System.out.println("Stock updated");
        } else {
            System.out.println("Product not found");
        }
    }

    public void deleteProduct(int id) {
        products.remove(id);
        System.out.println("Product deleted");
    }

    public Product searchProduct(int id) {
        return products.get(id);
    }

    public List<Product> searchProduct(String name) {
        return products.values().stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public void stockReport() {
        System.out.println("\n--- Stock Report ---");
        products.values().forEach(System.out::println);
    }

    public void exportToFile() {
        try (FileWriter fw = new FileWriter("stock_report.txt")) {
            for (Product p : products.values()) {
                fw.write(p.toString() + "\n");
            }
            System.out.println("Stock report exported to stock_report.txt");
        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
