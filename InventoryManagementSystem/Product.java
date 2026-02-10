public class Product {

    private int id;
    private String name;
    private int stock;

    public Product(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        setStock(stock);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    // Prevent stock < 0
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.stock = stock;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Stock: " + stock;
    }
}
