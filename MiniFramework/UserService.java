public class UserService implements Service {

    @LogExecutionTime
    public void registerUser() {
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        System.out.println("User registered successfully");
    }

    @Override
    public void execute() {
        registerUser();
    }
}
