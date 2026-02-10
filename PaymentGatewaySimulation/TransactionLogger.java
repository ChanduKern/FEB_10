import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {

    private static List<String> logs = new ArrayList<>();

    public static void log(String message) {
        logs.add(message);
    }

    public static void showLogs() {
        System.out.println("\n--- Transaction Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
