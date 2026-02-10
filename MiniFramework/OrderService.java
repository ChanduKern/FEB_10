public class OrderService implements Service {

    @LogExecutionTime
    public void placeOrder() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        System.out.println("Order placed successfully");
    }

    @Override
    public void execute() {
        placeOrder();
    }
}
