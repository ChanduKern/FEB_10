import java.lang.reflect.Method;

public class FrameworkExecutor {

    public static void run(Service service) {

        Logger logger = Logger.getInstance();
        Class<?> cls = service.getClass();

        for (Method method : cls.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                try {
                    long start = System.currentTimeMillis();
                    method.invoke(service);
                    long end = System.currentTimeMillis();

                    logger.log(
                            method.getName() +
                                    " executed in " + (end - start) + " ms");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
